package stocast.api.model;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java implementation inspired by:
 * https://github.com/notoriaga/twitter-markov-chain/blob/master/src/wordCache.js
 */
public class WordCache implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String START = "_START";
    private static final String END = "_END";

    private class Word implements Serializable {

        int count;
        Map<String, Integer> nextWords;
        Map<String, WordStats> nextWordStats;
        Map<String, Integer> originalWords;

        Word() {
            this.count = 0;
            this.nextWords = new HashMap<>();
            this.nextWordStats = new HashMap<>();
            this.originalWords = new HashMap<>();
        }

        private void incrementNextWords(String key) {
            nextWords.merge(key, 1, (a, b) -> a + b);
        }

        private void incrementOriginalWords(String key) {
            originalWords.merge(key, 1, (a, b) -> a + b);
        }
    }

    private class WordStats implements Serializable {
        String nextWord;
        int frequency;
        float weight;
        float cumulativeWeight;
        Word node;

        WordStats(String nextWord, int frequency, int cumulativeFrequency, int sum, Word node) {
            this.nextWord = nextWord;
            this.frequency = frequency;
            this.weight = frequency / (float) cumulativeFrequency;
            this.cumulativeWeight = sum / (float) cumulativeFrequency;
            this.node = node;
        }
    }

    private Map<String, Word> cache;

    public WordCache() {
        this.cache = new HashMap<>();
    }

    public static WordCache of(String text) {
        WordCache wc = new WordCache();
        wc.addCorpus(text);
        return wc;
    }

    private static List<String> parseSentence(String sentence) {
        return Arrays.asList(sentence.split(" "));
    }

    private static String parseWord(String word) {
        return word.replaceAll("[\"'-;:,]", " ")
                .replaceAll("\\s+", " ");
    }

    public void addCorpus(String corpus) {
        addSentences(Stream.of(corpus
                .replaceAll("[\n\r]", " ") // Remove newlines
                .split("[.?!]")) // Separate into sentences
                .collect(Collectors.toList()));
    }

    private static boolean isEndingPunctuation(String word) {
        return word.matches("[.?!]");
    }

    private void addWord(String word) {
        Word w = cache.get(word);
        if (w == null) {
            w = new Word();
            w.count = 1;
            cache.put(word, w);
        } else {
            w.count += 1;
        }
    }

    private void addSentences(List<String> sentences) {
        for (String sentence : sentences) {
            String previousWord = START;
            for (String word : parseSentence(sentence)) {
                addWord(previousWord);
                if (isEndingPunctuation(word)) {
                    cache.get(previousWord).incrementNextWords(END);
                    addWord(END);
                    previousWord = START;
                } else {
                    String parsedWord = parseWord(word);
                    cache.get(previousWord).incrementNextWords(parsedWord);
                    addWord(parsedWord);
                    cache.get(parsedWord).incrementOriginalWords(word);
                    previousWord = parsedWord;
                }
            }
        }
        for (String word : cache.keySet()) {
            Word node = cache.get(word);
            int cumulativeFrequency = node.nextWords.keySet().stream()
                    .mapToInt(nextWord -> node.nextWords.get(nextWord))
                    .reduce(0, (sum, count) -> sum + count);
            int sum = 0;
            for (String nextWord : node.nextWords.keySet()) {
                int frequency = node.nextWords.get(nextWord);
                sum += frequency;
                WordStats n = new WordStats(nextWord, frequency, cumulativeFrequency, sum, node);
                node.nextWordStats.put(nextWord, n);
            }
        }
    }

    private String chooseNext(String word) {
        Word node = cache.get(word);
        float r = ThreadLocalRandom.current().nextFloat();
        Map<String, WordStats> nextWords = node.nextWordStats;
        for (String nextWord : nextWords.keySet()) {
            if (nextWords.get(nextWord).cumulativeWeight >= r) {
                return nextWord;
            }
        }
        return "";
    }

    private List<String> generateSentence(int minimumLength) {
        String word = START;
        List<String> statusWords = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < 30; i++) {
            word = chooseNext(word);
            assert word != null;
            length += word.length();
            if (statusWords.size() + length - 1 > 140) {
                return statusWords;
            }
            if (word.equals(END)) {
                break;
            }
            statusWords.add(word);
        }
        return statusWords.size() < minimumLength ?
                generateSentence(minimumLength) :
                statusWords;
    }

    private String chooseOriginal(Map<String, Integer> choices) {
        Set<String> words = choices.keySet();
        int wordCount = choices.values().stream().reduce(0, (a, b) -> a + b);
        float r = ThreadLocalRandom.current().nextFloat() * wordCount;
        float s = 0;
        for (String word : choices.keySet()) {
            s += choices.get(word);
            if (r < s) {
                return word;
            }
        }
        return (String)words.toArray()[0];
    }

    private List<String> toOriginalWords(List<String> status) {
        return status.stream()
                .map(word -> chooseOriginal(cache.get(word).originalWords))
                .collect(Collectors.toList());
    }

    public String generateStatus() {
        List<String> statusWords = generateSentence(3);
        return toOriginalWords(statusWords).stream()
                .reduce("", (str, word) -> word.matches("[.?!,:;]") ?
                        str + word :
                        str + " " + word)
                .trim()
                .replaceAll("\\s+", " ")
                .replaceAll("[\"]", "");
    }
}

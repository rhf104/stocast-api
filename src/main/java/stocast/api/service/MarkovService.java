package stocast.api.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarkovService {
    private List<WordCache> caches;

    private static WordCache generateWordCache(String corpora) {

    }

    public static List<String> parseCorpus(String corpus) {
        return Stream.of(corpus
                .replaceAll("[\n\r]", " ") // Remove newlines
                .split("[.?!]")) // Separate into sentences
                .map(MarkovService::parseSentence) // Separate into words
                .flatMap(List::stream) // Merge words into single list
                .map(MarkovService::parseWord) // Remove punctuation from words
                .filter(word -> !word.isEmpty()) // Remove empty words
                .collect(Collectors.toList());
    }

    private static List<String> parseSentence(String sentence) {
        return Arrays.asList(sentence.split(" "));
    }

    private static String parseWord(String word) {
        return word.replaceAll("[\"\'-;:,]", "").toLowerCase();
    }

    private class WordCache {

        private class Word {
            public int count;
            public Word next
        }

        private Map<String, Map<String, Integer>> cache;

        public Map<String, Integer> get(String word) {
            return cache.get(word);
        }

        public void put(String word, Map<String, Integer> state) {
            cache.put(word, state);
        }
    }
}

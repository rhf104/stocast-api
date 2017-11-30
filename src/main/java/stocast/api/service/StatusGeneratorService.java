package stocast.api.service;

import stocast.api.dao.AuthorDao;
import stocast.api.dao.StatusDao;
import stocast.api.dao.WordCacheDao;
import stocast.api.model.Status;
import stocast.api.model.WordCache;
import stocast.api.model.domain.AuthorEntity;
import stocast.api.model.domain.WordCacheEntity;

import javax.inject.Inject;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static stocast.api.util.Corpora.CORPORA;

public class StatusGeneratorService {

    private final StatusDao statusDao;
    private final WordCacheDao wordCacheDao;
    private final AuthorDao authorDao;

    @Inject
    public StatusGeneratorService(StatusDao statusDao, WordCacheDao wordCacheDao, AuthorDao authorDao) {
        this.statusDao = statusDao;
        this.wordCacheDao = wordCacheDao;
        this.authorDao = authorDao;
    }

    private <T> T getRandomListElement(List<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    private <T> T getRandomSetElement(Set<T> set) {
        int r = ThreadLocalRandom.current().nextInt(set.size());
        int i = 0;
        for (T item : set) {
            if (i == r)
                return item;
            i++;
        }
        return null;
    }

    Status generateStatus() {
        AuthorEntity author = getRandomListElement(authorDao.loadAll());
        WordCacheEntity wordCacheEntity = getRandomSetElement(author.getCachedTitles());
        return new Status(wordCacheEntity.getWordCache().generateStatus());
    }

    public void addCorpusToAuthor(String authorId, String corpus) {
        WordCacheEntity wordCacheEntity = new WordCacheEntity();
        wordCacheEntity.setWordCache(WordCache.of(corpus));
        Long wcId = wordCacheDao.save(wordCacheEntity);
        wordCacheEntity.setId(wcId);
        authorDao.addWordCache(Long.valueOf(authorId), wordCacheEntity);
    }

    private static String getRandomCorpus() {
        return CORPORA
                .get(ThreadLocalRandom.current().nextInt(CORPORA.size()));
    }


}

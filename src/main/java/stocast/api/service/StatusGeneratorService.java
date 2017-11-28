package stocast.api.service;

import stocast.api.dao.StatusDao;
import stocast.api.model.Status;
import stocast.api.model.WordCache;

import javax.inject.Inject;
import java.util.concurrent.ThreadLocalRandom;

import static stocast.api.util.Corpora.CORPORA;

public class StatusGeneratorService {

    private final StatusDao statusDao;

    @Inject
    public StatusGeneratorService(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    Status generateStatus() {
        Status status = new Status();
        WordCache wordCache = new WordCache();
        wordCache.addCorpus(getRandomCorpus());
        status.text = wordCache.generateStatus();
        return status;
    }

    private static String getRandomCorpus() {
        return CORPORA
                .get(ThreadLocalRandom.current().nextInt(CORPORA.size()));
    }


}

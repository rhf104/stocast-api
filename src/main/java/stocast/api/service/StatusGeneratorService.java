package stocast.api.service;

import stocast.api.dao.StatusDao;
import stocast.api.model.Status;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static stocast.api.util.Corpora.CORPORA;

public class StatusGeneratorService {

    private final StatusDao statusDao;
    private final MarkovService markovService;

    @Inject
    public StatusGeneratorService(StatusDao statusDao, MarkovService markovService) {
        this.statusDao = statusDao;
        this.markovService = markovService;
    }

    public Status generateStatus() {
        List<String> res = MarkovService.parseCorpus(getRandomCorpus());
        return new Status();
    }

    private static String getRandomCorpus() {
        return CORPORA
                .get(ThreadLocalRandom.current().nextInt(CORPORA.size()));
    }


}

package stocast.api.service;

import stocast.api.dao.StatusDao;
import stocast.api.model.Status;
import stocast.api.model.domain.StatusEntity;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StatusService {

    private final StatusDao statusDao;
    private final StatusGeneratorService statusGenerator;

    private static final int NUM_STATUSES = 100;

    @Inject
    public StatusService(StatusDao statusDao, StatusGeneratorService statusGeneratorService) {
        this.statusDao = statusDao;
        this.statusGenerator = statusGeneratorService;
    }

    public void saveStatus(Status status) {
        statusDao.save(new StatusEntity());
    }

    public List<Status> readStatuses() {
        return Stream.generate(statusGenerator::generateStatus)
                .limit(NUM_STATUSES)
                .collect(Collectors.toList());
    }
}

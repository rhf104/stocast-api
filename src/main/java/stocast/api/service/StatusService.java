package stocast.api.service;

import stocast.api.dao.StatusDao;
import stocast.api.model.Status;
import stocast.api.model.domain.StatusEntity;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class StatusService {

    private final StatusDao statusDao;
    private final StatusGeneratorService statusGenerator;

    @Inject
    public StatusService(StatusDao statusDao, StatusGeneratorService statusGeneratorService) {
        this.statusDao = statusDao;
        this.statusGenerator = statusGeneratorService;
    }

    public void saveStatus(Status status) {
        statusDao.save(new StatusEntity());
    }

    public List<Status> readStatuses() {
        return Collections.singletonList(statusGenerator.generateStatus());
    }
}

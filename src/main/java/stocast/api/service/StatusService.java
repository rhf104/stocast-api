package stocast.api.service;

import stocast.api.dao.StatusDao;
import stocast.api.model.Status;
import stocast.api.model.domain.StatusEntity;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class StatusService {

    private final StatusDao statusDao;

    @Inject
    public StatusService(StatusDao statusDao) {
        this.statusDao = statusDao;
    }

    public void saveStatus(Status status) {
        statusDao.save(new StatusEntity());
    }

    public List<Status> readStatuses() {
        return Collections.singletonList(new Status());
    }
}

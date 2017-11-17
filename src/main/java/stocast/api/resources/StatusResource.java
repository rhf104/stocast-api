package stocast.api.resources;

import com.google.common.collect.ImmutableMap;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stocast.api.model.Status;
import stocast.api.service.StatusService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.OK;
import static javax.ws.rs.core.Response.status;

@Path("/")
@Api(value = "/", description = "Stocast API Endpoints")
@Produces(APPLICATION_JSON)
public class StatusResource {
    private static final Logger logger = LoggerFactory.getLogger(StatusResource.class);

    private static final String API_VERSION_PATH = "/v1";

    private static final String STATUS_PATH = API_VERSION_PATH + "/statuses";
    private static final String STATUSES_FIELD_NAME = "statuses";

    private final StatusService statusService;

    @Inject
    public StatusResource(StatusService statusService) {
        this.statusService = statusService;
    }

    @GET
    @Path(STATUS_PATH)
    @Produces(APPLICATION_JSON)
    @ApiOperation(
            value = "Fetch new statuses from a user's main feed",
            notes = "Return list of statuses")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Status.class)})
    public Response getStatuses() {
        logger.info("Statuses request: accountId={}", "test");

        List<Status> statuses = statusService.readStatuses();
        logger.info("Statuses returned - [ {} ]", statuses);
        return status(OK)
                .entity(ImmutableMap.of(STATUSES_FIELD_NAME, statuses))
                .build();
    }
}

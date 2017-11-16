package stocast.api.resources;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stocast.api.auth.Account;
import stocast.api.model.Statuses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
@Api(value = "/", description = "Stocast API Endpoints")
@Produces({"application/json"})
public class StatusResource {
    private static final Logger logger = LoggerFactory.getLogger(StatusResource.class);

    public static final String API_VERSION_PATH = "/v1";

    private static final String STATUS_PATH = API_VERSION_PATH + "/statuses";

    private final String baseUrl;

    public StatusResource(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @GET
    @Path(STATUS_PATH)
    @Produces(APPLICATION_JSON)
    @ApiOperation(
            value = "Fetch new statuses from a user's main feed",
            notes = "Return list of statuses")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = Statuses.class)})
    public Response getStatuses() {
        logger.info("Status request: accountId={}", "test");

        Statuses statuses = Statuses.valueOf(
                "test"
        );
        logger.info("Statuses returned - [ {} ]", statuses);
        return Response.ok(statuses).build();
    }
}

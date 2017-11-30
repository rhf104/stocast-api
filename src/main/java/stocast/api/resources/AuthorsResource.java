package stocast.api.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stocast.api.model.Author;
import stocast.api.service.AuthorService;
import stocast.api.service.StatusGeneratorService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;
import static javax.ws.rs.core.Response.Status.CREATED;
import static javax.ws.rs.core.Response.status;

@Path("/")
@Api(value = "/", description = "Stocast API Endpoints")
@Produces(APPLICATION_JSON)
public class AuthorsResource {
    private static final Logger logger = LoggerFactory.getLogger(AuthorsResource.class);

    private static final String API_VERSION_PATH = "/v1";

    private static final String AUTHOR_KEY = "id";

    private static final String AUTHOR_PATH = API_VERSION_PATH + "/authors";
    private static final String AUTHOR_ID_PLACEHOLDER = "{" + AUTHOR_KEY + "}";
    private static final String AUTHOR_BY_ID = API_VERSION_PATH + "/authors/" + AUTHOR_ID_PLACEHOLDER;
    private static final String AUTHORS_FIELD_NAME = "authors";

    private static final String CORPORA_PATH = AUTHOR_BY_ID + "/corpora";

    private final AuthorService authorService;
    private final StatusGeneratorService statusGeneratorService;

    @Inject
    public AuthorsResource(AuthorService authorService, StatusGeneratorService statusGeneratorService) {
        this.authorService = authorService;
        this.statusGeneratorService = statusGeneratorService;
    }

    @POST
    @Path(AUTHOR_PATH)
    @Consumes(APPLICATION_JSON)
    @ApiOperation(
            value = "Creates a new author",
            notes = "Create new author")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "CREATED")})
    public Response createAuthor(Author author) {
        authorService.saveAuthor(author);
        logger.info("Author created - [ {} ]", author);
        return status(CREATED)
                .build();
    }

    @POST
    @Path(CORPORA_PATH)
    @Consumes(TEXT_PLAIN)
    @ApiOperation(
            value = "Creates a new corpus",
            notes = "Create new corpus")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "CREATED")})
    public Response createCorpus(@PathParam(AUTHOR_KEY) String authorId, String corpus) {
        statusGeneratorService.addCorpusToAuthor(authorId, corpus);
        logger.info("Corpus created - [ {} ]", corpus);
        return status(CREATED)
                .build();
    }
}

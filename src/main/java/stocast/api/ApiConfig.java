package stocast.api;

import org.glassfish.jersey.server.ResourceConfig;
import stocast.api.resources.StatusResource;

public class ApiConfig extends ResourceConfig {
    private static final String BASE_URL = "http://localhost:8080/";

    public ApiConfig() {
        register(new StatusResource(BASE_URL));
    }
}

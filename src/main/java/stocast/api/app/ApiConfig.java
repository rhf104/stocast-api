package stocast.api.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import org.glassfish.jersey.server.ResourceConfig;
import stocast.api.resources.StatusResource;

public class ApiConfig extends ResourceConfig {

    public ApiConfig() {
        final Injector injector = createInjector(new AppModule());
        register(injector.getInstance(StatusResource.class));
    }

    private Injector createInjector(Module module) {
        return Guice.createInjector(module);
    }
}

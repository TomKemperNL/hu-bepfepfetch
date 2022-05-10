package nl.hu.bep.bepfep;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("jersey")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(MultiPartFeature.class);
        packages("nl.hu.bep.bepfep.rest");
    }
}
package nl.hu.bep.bepfep.rest;

import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/multipart")
public class FetchMultiPartResource {

    @POST
    @Consumes("multipart/form-data")
    public Response leesForm(@FormDataParam("test1") String test1, @FormDataParam("test2") String test2){
        String result = String.format("Je stuurde %s en %s", test1, test2);
        return Response.ok(result).build();
    }
}

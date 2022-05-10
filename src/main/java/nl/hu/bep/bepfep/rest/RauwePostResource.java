package nl.hu.bep.bepfep.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rauw")
public class RauwePostResource {

    @POST
    public Response rauweInput(@FormParam("test1") String test1, @FormParam("test2") String test2) {
        String result = String.format("Je stuurde %s en %s", test1, test2);
        return Response.ok(result).build();
    }
}

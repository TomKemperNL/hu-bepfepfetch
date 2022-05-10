package nl.hu.bep.bepfep.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/formencoded")
public class FetchFormEncodedResource {

    @POST
    public Response leesForm(@FormParam("test1") String test1, @FormParam("test2") String test2){
        String result = String.format("Je stuurde %s en %s", test1, test2);
        return Response.ok(result).build();
    }
}

package nl.hu.bep.bepfep.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/json")
public class FetchJSONResource {

    public static class TestRequest {
        public String test1;
        public String test2;
    }

    public static class TestResponse {
        public String boodschap;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response leesForm(TestRequest req){
        String result = String.format("Je stuurde %s en %s", req.test1, req.test2);
        TestResponse resp = new TestResponse();
        resp.boodschap = result;

        return Response.ok(resp).build();
    }
}

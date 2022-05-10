package nl.hu.bep.bepfep.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloWorldResource {
    @GET
    public String helloWorld(){
        return "Hello World";
    }
}

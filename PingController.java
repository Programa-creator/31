package ua.hillel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/ping")
public class PingController {
    @GET
    public Response ping() {
        return Response.ok("OK").build();
    }
}

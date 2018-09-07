package org.jee8ng.ims.tasks.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("tasks")
public class TasksResource {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response get() {
    return Response.ok("task works").build();
  }
}

package my.demo.groud;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("")
public class GreetingResource {

  @ConfigProperty(name = "greeting.message")
  String greetingMessage;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/hello")
  public String hello() {
    return greetingMessage;
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/goodbye")
  public String goodbye() {
    return "Goodbye from RESTEasy Reactive";
  }
}

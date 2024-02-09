package my.demo.groud;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

@OpenAPIDefinition(
    servers = {@Server(url = "http://localhost:8080")},
    info = @Info(title = "Greeting API", version = "1.0"))
public class App extends Application {}

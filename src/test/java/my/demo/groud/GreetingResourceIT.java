package my.demo.groud;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import org.junit.jupiter.api.Test;

@QuarkusIntegrationTest
class GreetingResourceIT extends GreetingResourceTest {
  // Execute the same tests but in packaged mode.
}

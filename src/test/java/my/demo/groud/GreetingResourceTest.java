package my.demo.groud;

import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {
    @Test
    void testGoodbyeEndpoint() {
        given()
                .when()
                .get("/goodbye")
                .then()
                .statusCode(200)
                .body(Matchers.is("Goodbye from RESTEasy Reactive"));
    }

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello, World!"));
    }

}

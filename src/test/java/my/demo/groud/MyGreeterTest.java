package my.demo.groud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyGreeterTest {
  @Test
  void testGreeting() {
    MyGreeter greeter = new MyGreeter();
    assertEquals("hello Quarkus", greeter.greeting("Quarkus"));
  }
}

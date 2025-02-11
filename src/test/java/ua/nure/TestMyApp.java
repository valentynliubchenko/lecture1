package ua.nure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyApp {
    @Test
    public void test(){
        String str = "Hello";
        Assertions.assertEquals("Hello", str);

    }

    @Test
    public void testGenerateGreetingWithName() {
        String result = MyApp.generateGreeting("John");
        Assertions.assertEquals("Hello John", result);
    }

    @Test
    public void testGenerateGreetingWithoutName() {
        String result = MyApp.generateGreeting("");
        Assertions.assertEquals("Hello ", result);
    }
}

package ua.nure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    public void testSum(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(10, calc.sum(4,6));
        Assertions.assertEquals(12, calc.sum(6,6));
    }
}

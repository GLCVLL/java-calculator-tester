package org.java.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	
    Calculator clc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, clc.add(2, 3), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(2, clc.subtract(5, 3), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(2.5, clc.divide(5, 2), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(6, clc.multiply(2, 3), 0);
    }

}

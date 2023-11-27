package org.java.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {
	
    @Test
    public void testCalculatePriceMinor() throws Exception {
        Ticket in = new Ticket(100, 10);
        assertEquals(100 * 0.21 * 0.8, in.calculatePrice(), 0);
    }

    @Test
    public void testCalculatePriceAdult() throws Exception {
        Ticket in = new Ticket(150, 25);
        assertEquals(150 * 0.21, in.calculatePrice(), 0);
    }

    @Test
    public void testCalculatePriceSenior() throws Exception {
        Ticket in = new Ticket(80, 70);
        assertEquals(80 * 0.21 * 0.6, in.calculatePrice(), 0);
    }

    @Test
    public void testInvalidInput() {
    Exception exception = assertThrows(Exception.class, () -> new Ticket(-100, 25));
        assertEquals("Distance and age must be positive numbers", exception.getMessage());
    }

}

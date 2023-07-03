package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void plus() {
        var cash = new Cash(3);
        cash.plus(4);
        assertEquals(7, cash.count());
    }

    @Test
    void minus() {
        var cash = new Cash(8);
        var result = cash.minus(5);
        assertTrue(result);
        assertEquals(3, cash.count());
    }

    @Test
    void Update() {
        var cash = new Cash(5);
        cash.plus(6);
        var result = cash.minus(3);
        assertTrue(result);
        assertEquals(8, cash.count());
    }

    @Test
    void transfer() {
        var cash = new Cash(1);
        var result = cash.minus(6);
        assertFalse(result);
        assertEquals(1, cash.count());
    }
}
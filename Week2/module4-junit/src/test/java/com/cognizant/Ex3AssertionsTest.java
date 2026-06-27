package com.cognizant;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ex3AssertionsTest {

    @Test
    void testAssertEquals() {
        assertEquals(10, 5 + 5);
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(10, 5 + 4);
    }

    @Test
    void testAssertTrue() {
        assertTrue(10 > 5);
    }

    @Test
    void testAssertFalse() {
        assertFalse(10 < 5);
    }

    @Test
    void testAssertNull() {
        String name = null;
        assertNull(name);
    }

    @Test
    void testAssertNotNull() {
        String name = "Cognizant";
        assertNotNull(name);
    }
}
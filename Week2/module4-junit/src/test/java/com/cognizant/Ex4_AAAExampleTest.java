package com.cognizant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;

public class Ex4_AAAExampleTest {

    private Ex4_AAAExample calculator;

    // Setup 
    @BeforeEach
    public void setUp() {
        System.out.println("Setting Up");
        calculator = new Ex4_AAAExample();
    }

    
    @Test
    public void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Teardown 
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up");
        calculator = null;
    }
}
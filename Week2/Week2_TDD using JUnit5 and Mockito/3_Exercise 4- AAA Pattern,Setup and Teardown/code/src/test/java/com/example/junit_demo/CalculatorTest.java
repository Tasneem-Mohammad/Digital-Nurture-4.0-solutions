package com.example.junit_demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
        System.out.println("Setup done");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown done");
    }

    @Test
    public void testAddition() {
        int a = 2, b = 3;
        int result = calculator.add(a, b);
        assertEquals(5, result);
    }
}

package com.example.junit_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	  @Test
    public void testAdd() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
}

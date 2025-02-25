package com.shubhi.scientificcalculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, calculatorService.squareRoot(25));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculatorService.power(2, 3));
    }

    @Test
    public void testSine() {
        assertEquals(0.5, calculatorService.sine(30), 0.01);
    }

    @Test
    public void testCosine() {
        assertEquals(0.866, calculatorService.cosine(30), 0.01);
    }
}

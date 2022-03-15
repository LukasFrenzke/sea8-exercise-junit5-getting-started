package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator(0, 0);

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void subtraction() {
        assertEquals(0, calculator.sub(1, 1));
    }

    @Test
    void multiplication() {
        assertEquals(4, calculator.mul(2, 2));
    }

    @Test
    void division() {
        assertEquals(1, calculator.div(2, 2));
    }
}
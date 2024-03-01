package Project_patterns_01_03_24.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void mult() {
        assertEquals(30, Calculator.mult(5,6));
    }

    @Test
    void div() {
        assertEquals(5, Calculator.div(15,3));
    }
    @Test
    void divZero() {
        assertEquals(Double.POSITIVE_INFINITY, Calculator.div(15,0));
    }

    @Test
    void subtraction() {
        assertEquals(5, Calculator.subtraction(15,10));
    }

    @Test
    void sum() {
        assertEquals(5, Calculator.sum(2,3));
    }

    @Test
    void testSum() {
        assertEquals(12, Calculator.sum(6,new int[]{1,2,3}));
    }

    @Test
    void testSum1() {
        assertEquals(16, Calculator.sum(6,new int[]{1,2,3,4}));
    }
}
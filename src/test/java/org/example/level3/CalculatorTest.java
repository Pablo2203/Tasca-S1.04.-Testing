package org.example.level3;

import org.example.level3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator(10, 20);

    }
        @Test
        public void testSum () {
            calculator.sum();
            Assertions.assertEquals(30, calculator.sum());
            assertThat(calculator.sum()).isEqualTo(30);
        }
        @Test
        public void testSubstract () {
            Assertions.assertEquals(-10, calculator.substract());
            assertThat(calculator.substract()).isEqualTo(-10);
        }
        @Test
        public void testMultiply () {
            Assertions.assertEquals(200,calculator.multiply());
            assertThat(calculator.multiply()).isEqualTo(200);
        }
        @Test
        public void testDivide () {
            Assertions.assertEquals(0, calculator.divide());
            assertThat(calculator.divide()).isEqualTo(0);
        }

}

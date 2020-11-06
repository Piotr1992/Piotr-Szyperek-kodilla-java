package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator operation = context.getBean(Calculator.class);

        //When
        double resultAdd = operation.add(1.1, 2.2);
        double resultSub = operation.sub(4.4, 5.5);
        double resultMul = operation.mul(1.2, 3.4);
        double resultDiv = operation.div(8.6, 4.3);

        //Then
        assertEquals(3.3000000000000003, resultAdd);
        assertEquals(-1.0999999999999996, resultSub);
        assertEquals(4.08, resultMul);
        assertEquals(2.0, resultDiv);
    }
}

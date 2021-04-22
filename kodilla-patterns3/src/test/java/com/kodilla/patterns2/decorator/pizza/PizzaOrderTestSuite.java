package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedPrice = theOrder.getPrice();
        // Then
        assertEquals(new BigDecimal(15), calculatedPrice);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Cake and sauce tomato with cheese", description);
    }

    @Test
    public void testPizzaMargheritaGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMargheritaOrder(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(40), thePrice);
    }

    @Test
    public void testPizzaMargheritaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMargheritaOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Cake and sauce tomato with cheese and oregano", description);
    }

    @Test
    public void testPizzaPepperoniGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaPepperoniOrder(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(49), thePrice);
    }

    @Test
    public void testPizzaPepperoniGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaPepperoniOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Cake and sauce tomato with cheese, pepperoni sausage, onion, and oregano", description);
    }

    @Test
    public void testPizzaHawayanaGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaHawayanaOrder(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(45), thePrice);
    }

    @Test
    public void testPizzaHawayanaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaHawayanaOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Cake and sauce tomato with cheese, ham, pineapple and oregano", description);
    }

    @Test
    public void testPizzaCarbonaraGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaCarbonaraOrder(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(52), thePrice);
    }

    @Test
    public void testPizzaCarbonaraGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaCarbonaraOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Cake and sauce tomato with cheese, sour cream sauce, bacon, onion, champignons and oregano", description);
    }

    @Test
    public void testMixedPizzaOrderGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMargheritaOrder(theOrder);
        theOrder = new PizzaPepperoniOrder(theOrder);
        theOrder = new PizzaHawayanaOrder(theOrder);
        theOrder = new PizzaCarbonaraOrder(theOrder);
        // When
        BigDecimal calculatedPrice = theOrder.getPrice();
        // Then
        assertEquals(new BigDecimal(141), calculatedPrice);
    }

    @Test
    public void testMixedPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaMargheritaOrder(theOrder);
        theOrder = new PizzaPepperoniOrder(theOrder);
        theOrder = new PizzaHawayanaOrder(theOrder);
        theOrder = new PizzaCarbonaraOrder(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Cake and sauce tomato with cheese and oregano, pepperoni sausage, onion, and oregano, ham, pineapple and oregano, sour cream sauce, bacon, onion, champignons and oregano", description);
    }

}

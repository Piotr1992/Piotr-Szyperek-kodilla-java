package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .ingredient("Cucumber")
                .ingredient("Becon")
                .bun("Thin")
                .burgers(2)
                .sauce("Spicy")
                .ingredient("Cheese")
                .ingredient("Salad")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, howManyIngredients);
    }
}



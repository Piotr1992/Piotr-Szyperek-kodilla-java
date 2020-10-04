package com.kodilla.stream.world;

import org.junit.Assert;
import java.math.BigDecimal;
import java.util.*;
import org.junit.jupiter.api.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent firstContinent = new Continent();
        firstContinent.addCountry(new Country(new BigDecimal("111111111")));
        firstContinent.addCountry(new Country(new BigDecimal("222222222")));
        firstContinent.addCountry(new Country(new BigDecimal("333333333")));
        Continent secondContinent = new Continent();
        secondContinent.addCountry(new Country(new BigDecimal("555555555")));
        secondContinent.addCountry(new Country(new BigDecimal("444444444")));
        World w = new World();
        w.addlistContinent(firstContinent);
        w.addlistContinent(secondContinent);
        //When
        BigDecimal worldPeopleQuantity = w.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantity = new BigDecimal("1666666665");
        Assert.assertEquals(expectedQuantity, worldPeopleQuantity);
    }

}
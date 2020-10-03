
package com.kodilla.stream.world;

import com.kodilla.stream.world.*;

import org.junit.Assert;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;

import java.math.BigDecimal;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.mockito.junit.jupiter.*;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent firstContinent = new Continent(new ArrayList<>());
        firstContinent.addlistCountry(new Country(new BigDecimal("111111111")));
        firstContinent.addlistCountry(new Country(new BigDecimal("222222222")));
        firstContinent.addlistCountry(new Country(new BigDecimal("333333333")));
        Continent secondContinent = new Continent(new ArrayList<>());
        secondContinent.addlistCountry(new Country(new BigDecimal("555555555")));
        secondContinent.addlistCountry(new Country(new BigDecimal("444444444")));
        World w = new World();
        w.addlistContinent(firstContinent);
        w.addlistContinent(secondContinent);
        //When
        BigDecimal worldPeopleQuantity = w.getlistContinent().stream()
                .flatMap(continent -> continent.getlistCountry().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        //Then
        BigDecimal expectedQuantity = new BigDecimal("1666666665");
        Assert.assertEquals(expectedQuantity, worldPeopleQuantity);
    }

}

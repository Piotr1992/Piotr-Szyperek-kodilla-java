package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

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

        BigDecimal worldPeopleQuantity = w.getlistContinent().stream()
                .flatMap(continent -> continent.getlistCountry().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));

        System.out.println("worldPeopleQuantity = " + worldPeopleQuantity);

    }
}

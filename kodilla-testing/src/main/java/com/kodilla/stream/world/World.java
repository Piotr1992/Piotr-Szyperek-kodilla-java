
package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class World {
    public BigDecimal population;
    List<Continent> listContinent = new ArrayList<>();
    List<Country> listCountries = new ArrayList<>();

    public void addlistContinent(Continent c) {
        listContinent.add(c);
    }

    public List<Continent> getlistContinent() {
        return listContinent;
    }

    public BigDecimal getPeopleQuantity() {
        population = getlistContinent().stream()
                        .flatMap(continent -> continent.getlistCountry().stream())
                        .map(country -> country.getPeopleQuantity())
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return population;
    }

/*    public static void main(String[] args) {

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

    }                   */

}

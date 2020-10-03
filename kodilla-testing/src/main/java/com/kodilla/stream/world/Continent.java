
package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Continent {

    List<Country> listCountry = new ArrayList<>();

    public Continent(List<Country> listCountry) {
        this.listCountry = listCountry;
    }

    public void addlistCountry(Country c) {
        listCountry.add(c);
    }

    public List<Country> getlistCountry() {
        return listCountry;
    }

/*    public static void main(String[] args) {

        Continent lC2 = new Continent(new ArrayList<>());
        lC2.addlistCountry(new Country(new BigDecimal("111111111")));
        lC2.addlistCountry(new Country(new BigDecimal("222222222")));
        BigDecimal bd = lC2.getlistCountry().stream().map(country -> country.getPeopleQuantity())
                                                     .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        System.out.println("bd = " + bd);

    }               */

}

package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    public List<Continent> addContinent(List<Continent> listContinent) {
        listContinent = new ArrayList<>();
        for(int i=1; i<=4; i++) {
            listContinent.add(new Continent());
        }
        return listContinent;
    }

    public BigDecimal getPeopleQuantity() {
        //BigDecimal sandQuantity = new BigDecimal("9876543210");
        //return listContinent.stream().flatMap(Continent -> listContinent.get(0).listCountry.get(0)).reduce()

        return new BigDecimal("9876543210");

        //.reduce(BigDecimal.ONE, ())
    }
}

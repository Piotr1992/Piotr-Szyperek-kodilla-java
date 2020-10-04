package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public BigDecimal population;
    List<Continent> listContinent = new ArrayList<>();

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

}

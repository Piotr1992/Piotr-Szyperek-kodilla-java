package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    public BigDecimal population;// = new BigDecimal("9876543210");

    public Country(BigDecimal population) {
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

}

package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    List<Country> listCountry = new ArrayList<>();

    public Continent() {
        this.listCountry = listCountry;
    }

    public void addCountry(Country c) {
        listCountry.add(c);
    }

    public List<Country> getlistCountry() {
        return listCountry;
    }

}

package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

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

}

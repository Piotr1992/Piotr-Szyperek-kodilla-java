package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    BigDecimal bd = new BigDecimal("10");

    List<Country> listCountry = new ArrayList<>();

    public List<Country> addCountry(List<Country> listCountry) {
        listCountry  = new ArrayList<Country>();
        for(int i=1; i<=2; i++) {
            listCountry.add(new Country(bd));
            bd.add(bd);
        }
        return listCountry;
    }

    public BigDecimal getCountryList() {
        return new BigDecimal("9876543210");
    }
}

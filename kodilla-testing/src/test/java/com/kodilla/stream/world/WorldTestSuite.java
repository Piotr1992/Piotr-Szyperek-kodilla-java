
package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        List<Continent> listContinents = new ArrayList<>();
        List<Country> listCountries = new ArrayList<>();
        listCountries.add(new Country(new BigDecimal(350000000)));
        listCountries.add(new Country(new BigDecimal(450000000)));
        listContinents.add(new Continent());
        world.addContinent(listContinents);
        //When
/*        BigDecimal worldPeopleQuantity = world.getPeopleQuantity().stream()
                .flatMap(continent -> continent.getPeopleQuantity().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
                        //Then
 */
//        BigDecimal expectedQuantity = new BigDecimal("800000000");
//        Assert.assertEquals(expectedQuantity, worldPeopleQuantity);
    }

}

package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent america = new Continent();
        Country poland = new Country(38000000);
        Country france = new Country(60000000);
        Country spain = new Country(41230123);
        Country uk = new Country(65648000);
        Country china = new Country(1381000000);
        Country india = new Country(1200000000);
        Country usa = new Country(323127000);
        Country canada = new Country(35151000);
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(spain);
        europe.addCountry(uk);
        asia.addCountry(china);
        asia.addCountry(india);
        america.addCountry(usa);
        america.addCountry(canada);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("3144156123");
        Assert.assertEquals(expectedPeople, totalPeople);
        Assert.assertEquals(3,world.getListOfContinents().size());
    }
}

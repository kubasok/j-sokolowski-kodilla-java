package com.kodilla.good.patterns.ordering;

import com.kodilla.good.patterns.flightCompany.FlightSearcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightCompanyTestSuite {
    @Test
    public void testSearchFrom(){
        FlightSearcher flightSearcher = new FlightSearcher();
        List<String> testFlightsFrom = flightSearcher.flightSearchFrom("WRO");
        Assert.assertEquals(3,testFlightsFrom.size());
        Assert.assertTrue(testFlightsFrom.contains("WRO - WAW"));
        Assert.assertFalse(testFlightsFrom.contains("WRO - KRK"));
    }

    @Test
    public void testSearchTo(){
        FlightSearcher flightSearcher = new FlightSearcher();
        List<String> testFlightsTo = flightSearcher.flightSearchTo("WAW");
        Assert.assertEquals(4,testFlightsTo .size());
        Assert.assertTrue(testFlightsTo .contains("KRK - WAW"));
        Assert.assertFalse(testFlightsTo .contains("MDI - WAW"));
    }

    @Test
    public void testSearchVia(){
        FlightSearcher flightSearcher = new FlightSearcher();
        List<String> testFlightsVia = flightSearcher.flightSearchVia("WAW", "MDI");
        Assert.assertEquals(2,testFlightsVia.size());
        Assert.assertTrue(testFlightsVia.contains("WAW via GDN to MDI"));
    }
}

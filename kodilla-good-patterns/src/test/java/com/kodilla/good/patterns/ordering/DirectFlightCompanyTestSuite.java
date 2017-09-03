package com.kodilla.good.patterns.ordering;

import com.kodilla.good.patterns.flightCompany.ConnectedFlight;
import com.kodilla.good.patterns.flightCompany.DirectFlight;
import com.kodilla.good.patterns.flightCompany.FlightSearcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DirectFlightCompanyTestSuite {
    @Test
    public void testSearchFrom(){
        FlightSearcher flightSearcher = new FlightSearcher();
        List<DirectFlight> testFlightsFrom = flightSearcher.flightSearchFrom("WRO");
        testFlightsFrom.stream().map(f -> f.flightDescr()).forEach(System.out::println);
        Assert.assertEquals(3,testFlightsFrom.size());
        Assert.assertTrue(testFlightsFrom.contains(new DirectFlight("WRO","WAW")));
        Assert.assertFalse(testFlightsFrom.contains(new DirectFlight("WRO","KRK")));
    }

    @Test
    public void testSearchTo(){
        FlightSearcher flightSearcher = new FlightSearcher();
        List<DirectFlight> testFlightsTo = flightSearcher.flightSearchTo("WAW");
        testFlightsTo.stream().map(f -> f.flightDescr()).forEach(System.out::println);
        Assert.assertEquals(4,testFlightsTo .size());
        Assert.assertTrue(testFlightsTo .contains(new DirectFlight("KRK", "WAW")));
        Assert.assertFalse(testFlightsTo .contains(new DirectFlight("MDI", "WAW")));
    }

    @Test
    public void testSearchVia(){
        FlightSearcher flightSearcher = new FlightSearcher();
        List<ConnectedFlight> testFlightsVia = flightSearcher.flightSearchVia("WAW", "MDI");

        if (testFlightsVia.isEmpty()) {
            System.out.println("No flights with connection.");
        } else {
            testFlightsVia.stream().map(f -> f.flightDescr()).forEach(System.out::println);
        }

        Assert.assertEquals(1,testFlightsVia.size());
        Assert.assertTrue(testFlightsVia.contains(new ConnectedFlight("WAW","GDN","MDI")));
    }
}

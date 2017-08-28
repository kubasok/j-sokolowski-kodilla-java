package com.kodilla.exception.exceptionTest;

import org.junit.Assert;
import org.junit.Test;

public class exceptionTestSuite {
    @Test
    public void testFindFlightFalse() {
        FlightFinder finder = new FlightFinder();
        Flight flightSearched = new Flight("Warsaw Modlin", "Buenos Aires Ezeiza");
        Boolean result = null;
        try {
            result = finder.findFlight(flightSearched);
            if (result) {
                System.out.println("Flight found!");
            } else {
                System.out.println("Flight not found.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found. Check the airports names.");
        } finally {
            System.out.println("Search has ended!");
        }
        Assert.assertFalse(result);
    }

    @Test
    public void testFindFlightTrue() {
        FlightFinder finder = new FlightFinder();
        Flight flightSearched = new Flight("Warsaw Modlin", "Cracow Balice");
        Boolean result = null;
        try {
            result = finder.findFlight(flightSearched);
            if (result) {
                System.out.println("Flight found!");
            } else {
                System.out.println("Flight not found.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found. Check the airports names.");
        } finally {
            System.out.println("Search has ended!");
        }
        Assert.assertTrue(result);
    }

    @Test(expected = RouteNotFoundException.class)
    public void testFindFlightNull() throws RouteNotFoundException {
        FlightFinder finder = new FlightFinder();
        Flight flightSearched = new Flight("Warsaw Modlin", "Test Airport");

        if (finder.findFlight(flightSearched)) {
            System.out.println("Flight found!");
        } else {
            System.out.println("Flight not found.");
        }
    }
}

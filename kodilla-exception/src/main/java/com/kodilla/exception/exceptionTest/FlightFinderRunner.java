package com.kodilla.exception.exceptionTest;

public class FlightFinderRunner {
    public static void main(String args[]) {
        FlightFinder finder = new FlightFinder();
        Flight flightSearched = new Flight("Warsaw Modlin","Imaginary Airport");
        try {
            finder.findFlight(flightSearched);
        } catch(RouteNotFoundException e) {
            System.out.println("Route not found. Check the airports names.");
        } finally {
            System.out.println("Search has ended!");
        }
    }
}

package com.kodilla.exception.exceptionTest;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Warsaw Modlin",true);
        airportMap.put("Warsaw Chopin",false);
        airportMap.put("London Heathrow",true);
        airportMap.put("Madrid Barajas",false);
        airportMap.put("Buenos Aires Ezeiza",false);
        airportMap.put("Cracow Balice",true);

        try {
            if (airportMap.get(flight.getDepartureAirport()).booleanValue() && airportMap.get(flight.getArrivalAirport()).booleanValue()) {
                System.out.println("Flight found:\nDeparture: " + flight.getDepartureAirport() +
                "\nArrival: " + flight.getArrivalAirport());
            } else {
                System.out.println("There is no such flight.");
            }
        } catch (NullPointerException e) {
            throw new RouteNotFoundException();
        }
    }
}

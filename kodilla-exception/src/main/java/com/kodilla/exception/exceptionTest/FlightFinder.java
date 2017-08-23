package com.kodilla.exception.exceptionTest;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> airportMap = new HashMap<>();
    public FlightFinder(){
        airportMap.put("Warsaw Modlin",true);
        airportMap.put("Warsaw Chopin",false);
        airportMap.put("London Heathrow",true);
        airportMap.put("Madrid Barajas",false);
        airportMap.put("Buenos Aires Ezeiza",false);
        airportMap.put("Cracow Balice",true);
    }
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (airportMap.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException();
        } else {
            return airportMap.get(flight.getArrivalAirport());
        }

    }
}

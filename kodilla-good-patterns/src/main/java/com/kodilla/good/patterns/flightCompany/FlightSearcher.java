package com.kodilla.good.patterns.flightCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    List<DirectFlight> flightList = new FlightList().getFlightList();

    public List<DirectFlight> flightSearchFrom(String searchedAirport) {
        List<DirectFlight> flightsFrom = flightList.stream()
                .filter(f -> f.getAirportFrom().equals(searchedAirport))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public List<DirectFlight> flightSearchTo(String searchedAirport) {
        List<DirectFlight> flightsTo = flightList.stream()
                .filter(f -> f.getAirportTo().equals(searchedAirport))
                .collect(Collectors.toList());
        return flightsTo;
    }

    public List<ConnectedFlight> flightSearchVia(String searchedAirportFrom, String searchedAirportTo) {

        DirectFlight directFlight = new DirectFlight(searchedAirportFrom, searchedAirportTo);

        List<String> connectedAirportsFrom = flightSearchFrom(searchedAirportFrom).stream()
                .filter(f -> !f.equals(directFlight))
                .map(f -> f.getAirportTo())
                .collect(Collectors.toList());

        List<ConnectedFlight> flightsVia = flightSearchTo(searchedAirportTo).stream()
                .filter(f -> !f.equals(directFlight))
                .filter(f -> connectedAirportsFrom.contains(f.getAirportFrom()))
                .map(f -> new ConnectedFlight(searchedAirportFrom, f.getAirportFrom(), searchedAirportTo))
                .collect(Collectors.toList());

        return flightsVia;
    }
}
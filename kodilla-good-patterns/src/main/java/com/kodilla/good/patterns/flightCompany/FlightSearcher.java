package com.kodilla.good.patterns.flightCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    List<Flight> flightList = new FlightList().flightList;

    public List<String> flightSearchFrom(String searchedAirport) {
        List<String> flightsFrom = flightList.stream()
                .filter(f -> f.flightContains(searchedAirport))
                .map(f -> f.flightDescrFrom(searchedAirport))
                .collect(Collectors.toList());
        flightsFrom.stream().forEach(System.out::println);
        return flightsFrom;
    }

    public List<String> flightSearchTo(String searchedAirport) {
        List<String> flightsTo = flightList.stream()
                .filter(f -> f.flightContains(searchedAirport))
                .map(f -> f.flightDescrTo(searchedAirport))
                .collect(Collectors.toList());
        flightsTo.stream().forEach(System.out::println);
        return flightsTo;
    }

    public List<String> flightSearchVia(String searchedAirportFrom, String searchedAirportTo) {
        Flight searchedFlight = new Flight(searchedAirportFrom, searchedAirportTo);
        String directFlight = flightList.stream()
                .filter(f -> f.equals(searchedFlight))
                .map(f -> f.flightDescrFrom(searchedFlight.getAirportA()))
                .collect(Collectors.joining());

        List<String> connectedAirportsFrom = flightList.stream()
                .filter(f -> (f.flightContains(searchedAirportFrom) && !f.flightContains(searchedAirportTo)))
                .map(f -> f.otherAirport(searchedAirportFrom))
                .collect(Collectors.toList());

        List<String> flightsVia = flightList.stream()
                .filter(f -> (f.flightContains(searchedAirportTo) && !f.flightContains(searchedAirportFrom)))
                .map(f -> f.otherAirport(searchedAirportTo))
                .filter(a -> connectedAirportsFrom.contains(a))
                .map(a -> searchedAirportFrom + " via " + a + " to " + searchedAirportTo)
                .collect(Collectors.toList());

        if (directFlight.isEmpty()){
            System.out.println("No direct flights.");
        } else{
            System.out.println("Direct flight: " + directFlight);
        }

        if (flightsVia.isEmpty()) {
            System.out.println("No flights with connection.");
        } else {
            flightsVia.stream().forEach(System.out::println);
        }

        return flightsVia;
    }
}
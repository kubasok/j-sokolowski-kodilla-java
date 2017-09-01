package com.kodilla.good.patterns.flightCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearcher {
    List<Flight> flightList = new FlightList().flightList;

    public void flightSearchFrom(String searchedAirport){
        List<String> flightsFrom = flightList.stream()
                .filter(f -> (f.getAirportA().equals(searchedAirport) || f.getAirportB().equals(searchedAirport)))
                .map(f -> f.flightDescrFrom(searchedAirport))
                .collect(Collectors.toList());
        flightsFrom.stream().forEach(System.out::println);
    }

    public void flightSearchTo(String searchedAirport){
        List<String> flightsTo = flightList.stream()
                .filter(f -> (f.getAirportA().equals(searchedAirport) || f.getAirportB().equals(searchedAirport)))
                .map(f -> f.flightDescrTo(searchedAirport))
                .collect(Collectors.toList());
        flightsTo.stream().forEach(System.out::println);
    }

    public void flightSearchVia(String searchedAirportFrom, String searchedAirportTo){
        Flight searchedFlight = new Flight(searchedAirportFrom, searchedAirportTo);
        String directFlight = flightList.stream()
                .filter(f -> f.equals(searchedFlight))
                .map(f -> f.flightDescrFrom(searchedFlight.getAirportA()))
                .collect(Collectors.joining());

        System.out.println(directFlight);
    }
}

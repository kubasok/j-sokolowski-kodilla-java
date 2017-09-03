package com.kodilla.good.patterns.flightCompany;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<DirectFlight> flightList = new ArrayList<>();

    public FlightList() {
        addTwoWayFlight("WAW", "KRK");
        addTwoWayFlight("WAW", "EZE");
        addTwoWayFlight("WAW", "GDN");
        addTwoWayFlight("MDI", "GDN");
        addTwoWayFlight("WAW", "WRO");
        addTwoWayFlight("RZE", "WRO");
        addTwoWayFlight("WRO", "GDN");
        addOneWayFlight("MDI", "KRK");
        addOneWayFlight("KRK", "MAD");
        addOneWayFlight("MAD", "GDN");
    }

    public void addTwoWayFlight(String airportA, String airportB) {
        flightList.add(new DirectFlight(airportA, airportB));
        flightList.add(new DirectFlight(airportB, airportA));

    }

    public void addOneWayFlight(String airportFrom, String airportTo) {
        flightList.add(new DirectFlight(airportFrom, airportTo));
    }

    public List<DirectFlight> getFlightList() {
        return flightList;
    }
}

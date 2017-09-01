package com.kodilla.good.patterns.flightCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightList {
    public List<Flight> flightList = new ArrayList<>();

    public FlightList() {
        flightList.add(new Flight("WAW", "KRK"));
        flightList.add(new Flight("MDI", "MAD"));
        flightList.add(new Flight("WAW", "EZE"));
        flightList.add(new Flight("WAW", "GDN"));
        flightList.add(new Flight("MDI", "GDN"));
        flightList.add(new Flight("WAW", "WRO"));
        flightList.add(new Flight("RZE", "WRO"));
        flightList.add(new Flight("WRO", "GDN"));
        flightList.add(new Flight("MDI", "KRK"));
        flightList.add(new Flight("KRK", "MAD"));
        flightList.add(new Flight("MAD", "GDN"));
    }
}

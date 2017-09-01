package com.kodilla.good.patterns.flightCompany;

public class App {
    public static void main(String[] args){
        FlightSearcher flightSearcher = new FlightSearcher();
//        flightSearcher.flightSearchFrom("WAW");
//        flightSearcher.flightSearchTo("MDI");
        flightSearcher.flightSearchVia("WAW", "MDI");
    }
}

package com.kodilla.good.patterns.flightCompany;

public class Flight {
    private final String airportA;
    private final String airportB;

    public Flight(final String airportA, final String airportB) {
        this.airportA = airportA;
        this.airportB = airportB;
    }

    public String getAirportA() {
        return airportA;
    }

    public String getAirportB() {
        return airportB;
    }

    public String flightDescrFrom(String airport){
        if (airportA.equals(airport)){
            return airportA + " - " + airportB;
        } else {
            return airportB+ " - " + airportA;
        }
    }

    public String flightDescrTo(String airport){
        if (airportA.equals(airport)){
            return airportB + " - " + airportA;
        } else {
            return airportA + " - " + airportB;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!airportA.equals(flight.airportA)) return false;
        return airportB.equals(flight.airportB);
    }

    @Override
    public int hashCode() {
        int result = airportA.hashCode();
        result = 31 * result + airportB.hashCode();
        return result;
    }
}

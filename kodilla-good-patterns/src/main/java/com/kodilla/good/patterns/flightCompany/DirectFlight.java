package com.kodilla.good.patterns.flightCompany;

public class DirectFlight {
    private final String airportFrom;
    private final String airportTo;

    public DirectFlight(final String airportFrom, final String airportTo) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectFlight flight = (DirectFlight) o;

        if (!airportFrom.equals(flight.airportFrom)) return false;
        return airportTo.equals(flight.airportTo);
    }

    @Override
    public int hashCode() {
        int result = airportFrom.hashCode();
        result = 31 * result + airportTo.hashCode();
        return result;
    }

    public String flightDescr() {
        return airportFrom + " - " + airportTo;
    }
}

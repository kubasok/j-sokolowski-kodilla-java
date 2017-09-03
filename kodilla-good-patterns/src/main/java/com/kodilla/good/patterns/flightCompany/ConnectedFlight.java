package com.kodilla.good.patterns.flightCompany;

public class ConnectedFlight {
    private final String airportFrom;
    private final String airportVia;
    private final String airportTo;

    public ConnectedFlight(final String airportFrom, final String airportVia, final String airportTo) {
        this.airportFrom = airportFrom;
        this.airportVia = airportVia;
        this.airportTo = airportTo;
    }

    public String flightDescr() {
        return airportFrom + " via " + airportVia + " to " + airportTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectedFlight that = (ConnectedFlight) o;

        if (!airportFrom.equals(that.airportFrom)) return false;
        if (!airportVia.equals(that.airportVia)) return false;
        return airportTo.equals(that.airportTo);
    }

    @Override
    public int hashCode() {
        int result = airportFrom.hashCode();
        result = 31 * result + airportVia.hashCode();
        result = 31 * result + airportTo.hashCode();
        return result;
    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final long numberOfPeople;

    public Country(final long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getNumberOfPeople() {
        return BigDecimal.valueOf(numberOfPeople);
    }

}

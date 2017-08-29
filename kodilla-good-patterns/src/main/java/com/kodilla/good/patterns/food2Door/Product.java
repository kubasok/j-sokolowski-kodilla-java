package com.kodilla.good.patterns.food2Door;

public class Product {
    private final String name;
    private final String unit;

    public Product(final String name, final String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }
}

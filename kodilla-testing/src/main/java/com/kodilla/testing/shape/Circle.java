package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;
    private String shapeName;

    public double getField() {
        return Math.PI * r^2;
    }

    public String getShapeName() {
        return shapeName;
    }
}

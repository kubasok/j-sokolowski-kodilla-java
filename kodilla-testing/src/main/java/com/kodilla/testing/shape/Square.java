package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private String shapeName;

    public double getField() {
        return a^2;
    }

    public String getShapeName() {
        return shapeName;
    }
}

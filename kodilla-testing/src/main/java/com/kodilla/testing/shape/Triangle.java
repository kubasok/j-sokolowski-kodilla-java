package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a;
    private double h;
    private String shapeName;

    public double getField() {
        return 0.5 * a * h;
    }

    public String getShapeName() {
        return shapeName;
    }
}

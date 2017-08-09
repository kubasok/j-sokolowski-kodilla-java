package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a;
    private double h;
    private String shapeName;

    public Triangle(double a, double h, String shapeName) {
        this.a = a;
        this.h = h;
        this.shapeName = shapeName;
    }

    public double getField() {
        return (double) 0.5 * a * h;
    }

    public String getShapeName() {
        return shapeName;
    }
}

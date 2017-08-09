package com.kodilla.testing.shape;


public class Circle implements Shape {

    private double r;
    private String shapeName;

    public Circle(double r, String shapeName) {
        this.r = r;
        this.shapeName = shapeName;
    }

    public double getField() {
        return 3.14 * Math.pow(r,2);
    }

    public String getShapeName() {
        return shapeName;
    }
}

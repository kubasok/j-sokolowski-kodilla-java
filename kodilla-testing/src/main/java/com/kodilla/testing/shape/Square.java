package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private String shapeName;

    public Square(double a, String shapeName) {
        this.a = a;
        this.shapeName = shapeName;
    }

    public double getField() {
        return (double) Math.pow(a,2);
    }

    public String getShapeName() {
        return shapeName;
    }
}

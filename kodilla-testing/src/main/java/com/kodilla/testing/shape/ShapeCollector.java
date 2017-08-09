package com.kodilla.testing.shape;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeCollectorList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapeCollectorList.add(shape);
    }
    public void removeFigure(Shape shape){
        shapeCollectorList.remove(shape);
    }
    public Shape getFigure(int n){
        return shapeCollectorList.get(n);
    }
    public String showFigures(){
        String figuresSet = "";
        for (Shape shape:shapeCollectorList) {
            figuresSet = figuresSet + shape.getShapeName() + " " + shape.getField() + "\n";
        }
        return figuresSet;
    }
}

package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Before
    public void before() {
        System.out.println("ShapeCollector Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("ShapeCollector Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("ShapeCollector Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("ShapeCollector Test Suite: end");
    }

    @Test
    public void testShapeCollectorAddGetFigures(){
        Shape testCircle = new Circle(2, "Circle1");
        Shape testSquare = new Square(4, "Square1");
        Shape testTriangle = new Triangle(3, 4,"Triangle1");

        ShapeCollector collector =  new ShapeCollector();

        collector.addFigure(testCircle);
        collector.addFigure(testSquare);
        collector.addFigure(testTriangle);

        Assert.assertEquals(collector.shapeCollectorList.size(),3);
        Assert.assertEquals("Circle1",collector.getFigure(0).getShapeName());
        Assert.assertEquals("Square1", collector.getFigure(1).getShapeName());
        Assert.assertEquals("Triangle1",collector.getFigure(2).getShapeName());
    }

    @Test
    public void testShapeCollectorShowFigures(){
        Shape testCircle = new Circle(2, "Circle1");
        Shape testSquare = new Square(4, "Square1");
        Shape testTriangle = new Triangle(3, 4,"Triangle1");

        ShapeCollector collector =  new ShapeCollector();

        collector.addFigure(testCircle);
        collector.addFigure(testSquare);
        collector.addFigure(testTriangle);

        System.out.println(collector.showFigures());
        Assert.assertEquals(collector.showFigures(),"Circle1 12.56\nSquare1 16.0\nTriangle1 6.0\n");
    }

    @Test
    public void testShapeCollectorRemoveFigure(){
        Shape testCircle = new Circle(2, "Circle1");
        Shape testSquare = new Square(4, "Square1");
        Shape testTriangle = new Triangle(3, 4,"Triangle1");

        ShapeCollector collector =  new ShapeCollector();

        collector.addFigure(testCircle);
        collector.addFigure(testSquare);
        collector.addFigure(testTriangle);

        collector.removeFigure(testCircle);
        collector.removeFigure(testSquare);
        collector.removeFigure(testTriangle);

        Assert.assertEquals(collector.showFigures(),"");
        Assert.assertEquals(0,collector.shapeCollectorList.size());
    }
}

package com.ics.demo.oop;

public class TestingOop {

    public static void main (String arg[]){
        Rectangle rectangle = new Rectangle(12, 12, ShapeType.TWO_D);
        Circle circle = new Circle(7,ShapeType.TWO_D);
        Triangle triangle = new Triangle(12,12,ShapeType.TWO_D);

        System.out.println(rectangle.toString());
        System.err.println(circle.toString());
        System.out.println(triangle.toString());
    }
}

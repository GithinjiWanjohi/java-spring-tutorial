package com.ics.demo.oop;

public class Triangle extends Shape implements Shape.PerimeterInterface {

    private double base;
    private double height;


    public Triangle(double base, double height, ShapeType shapeType) {
        super(shapeType);

        this.base = base;
        this.height = height;

        calculateArea();
        calculatePerimeter();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void calculateArea() {
        area = 1/2 * base * height;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = base * 3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", shapeType=" + shapeType +
                '}';
    }
}

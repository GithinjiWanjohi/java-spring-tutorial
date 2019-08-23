package com.ics.demo.oop;

public abstract class Shape {

    protected double area;
    protected double perimeter;
    protected ShapeType shapeType;

    public Shape(ShapeType shapeType){
        this.shapeType = shapeType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    abstract void calculateArea();

    public interface PerimeterInterface{
        void calculatePerimeter();
    }
}

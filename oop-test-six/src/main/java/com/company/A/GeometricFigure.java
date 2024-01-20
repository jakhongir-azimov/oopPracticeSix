package com.company.A;

public class GeometricFigure {
    double area;
    double perimeter;

    public GeometricFigure(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public void calculateArea() {
        System.out.println("Area of GeometricFigure: " + area);
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of GeometricFigure: " + perimeter);
    }

}

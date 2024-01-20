package com.company.A;

public class Trapezium extends GeometricFigure {
    double sideA;
    double sideB;
    double height;

    public Trapezium(double sideA, double sideB, double height) {
        super(0, 0);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        area = ((sideA + sideB) / 2) * height;
        System.out.println("Area of Trapezium: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = sideA + sideB + 2 * height;
        System.out.println("Perimeter of Trapezium: " + perimeter);
    }
}

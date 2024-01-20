package com.company.A;

public class Rectangle extends GeometricFigure {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        super(0, 0);
        this.sideA = sideA;
        this.sideB = sideB;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        area = sideA * sideB;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (sideA + sideB);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

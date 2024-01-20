package com.company.A;

public class Triangle extends GeometricFigure {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super(0, 0);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}

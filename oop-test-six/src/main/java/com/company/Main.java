package com.company;


import com.company.A.Rectangle;
import com.company.A.Trapezium;
import com.company.A.Triangle;
import com.company.B.Animal;
import com.company.B.Cat;
import com.company.B.Dog;
import com.company.B.Duck;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Trapezium trapezium = new Trapezium(2, 4, 3);
        Rectangle rectangle = new Rectangle(4, 5);

        triangle.calculateArea();
        triangle.calculatePerimeter();

        trapezium.calculateArea();
        trapezium.calculatePerimeter();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println("_ _ _ _ _ ");

        Animal animal = new Animal("Generic Animal");
        animal.sound();
        System.out.println("Animal name: " + animal.getName());

        Dog dog = new Dog("Buddy", "Woof");
        dog.sound();
        System.out.println("Dog name: " + dog.getName());

        Duck duck = new Duck("Daffy", "Quack");
        duck.sound();
        System.out.println("Duck name: " + duck.getName());

        Cat cat = new Cat("Mini", "Meow");
        cat.sound();
        System.out.println("Cat name: " + cat.getName());

    }
}
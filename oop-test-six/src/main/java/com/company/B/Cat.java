package com.company.B;

public class Cat extends Animal {
    private String meow;

    public Cat(String name, String meow) {
        super(name);
        this.meow = meow;
    }

    @Override
    public void sound() {
        System.out.println("Cat meows: " + meow);
    }
}

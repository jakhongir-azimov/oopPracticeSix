package com.company.B;

public class Duck extends Animal {
    private String quack;

    public Duck(String name, String quack) {
        super(name);
        this.quack = quack;
    }

    @Override
    public void sound() {
        System.out.println("Duck quacks: " + quack);
    }
}

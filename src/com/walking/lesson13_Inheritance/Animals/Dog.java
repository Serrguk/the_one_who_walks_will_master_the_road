package com.walking.lesson13_Inheritance.Animals;

public class Dog extends Animal{

    private final String color;

    public Dog(String color) {
        super();
        this.color = color;
    }

    @Override
    protected void sound() {
        System.out.println("Woof!");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                '}';
    }
}

package com.walking.lesson13_Inheritance.Animals;

public class Dog extends Animal{
    private static final String DOG_CLASS_NAME = "Dog";
    private final String color;

    public Dog(String color) {
        super(DOG_CLASS_NAME, "Woof!");
        this.color = color;
    }

    public void woof() {
        sound();
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

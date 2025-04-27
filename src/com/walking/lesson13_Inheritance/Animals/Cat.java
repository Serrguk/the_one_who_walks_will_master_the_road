package com.walking.lesson13_Inheritance.Animals;

public class Cat extends Animal {
    private final String color;

    public Cat(String color) {
        super();
        this.color = color;
    }

    @Override
    protected void sound() {
        System.out.println("Meow!");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}

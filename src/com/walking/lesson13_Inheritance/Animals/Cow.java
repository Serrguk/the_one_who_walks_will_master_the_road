package com.walking.lesson13_Inheritance.Animals;

public class Cow extends Animal {
    private final String name;
    private final String color;

    public Cow(String name, String color) {
        super();
        this.name = name;
        this.color = color;
    }

    @Override
    protected void sound() {
        System.out.println("Moo!");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

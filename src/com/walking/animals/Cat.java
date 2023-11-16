package com.walking.animals;

public class Cat extends Animal {
    private String color;
    private Cat() {
        System.out.println("I am a cat");
    }

    public Cat(String color) {
        super();
        this.color = color;
        System.out.println("I'm a " + color + " cat");
    }

    public String getColor() {
        return color;
    }
}

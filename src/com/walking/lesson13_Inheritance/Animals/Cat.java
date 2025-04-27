package com.walking.lesson13_Inheritance.Animals;

public class Cat extends Animal {
    private static final String CAT_CLASS_NAME = "Cat";
    private final String color;

    public Cat(String color) {
        super(CAT_CLASS_NAME, "Meow!");
        this.color = color;
    }

    public void meow() {
        sound();
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

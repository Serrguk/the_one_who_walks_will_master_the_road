package com.walking.lesson13_Inheritance.Animals;

public class Cow extends Animal {
    private static final String COW_CLASS_NAME = "Cow";
    private final String color;

    public Cow(String color) {
        super(COW_CLASS_NAME, "Moo!");
        this.color = color;
    }

    public void moo() {
        sound();
    }

    @Override
    public String toString() {
        return "Cow{" +
                "color='" + color + '\'' +
                '}';
    }
}

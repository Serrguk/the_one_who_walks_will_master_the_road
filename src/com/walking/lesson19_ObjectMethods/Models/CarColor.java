package com.walking.lesson19_ObjectMethods.Models;

public enum CarColor {
    WHITE ("White"),
    BLACK ("Black"),
    RED ("Red"),
    GREEN ("Green"),
    BLUE ("Blue"),
    GRAY ("Gray"),
    BROWN ("Brown"),
    YELLOW ("Yellow"),
    SILVER ("Silver"),
    ORANGE ("Orange");

    private final String color;

    CarColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}

package com.walking.lesson13_Inheritance.Animals;

public class Animal {
    private final String className;
    private final String sound;

    public Animal(String className, String sound) {
        this.className = className;
        this.sound = sound;
    }

    public void sound() {
        System.out.println(sound);
    }

    public String getClassName() {
        return className;
    }

    public String getColor() {
        return "";
    }
}

package com.walking.lesson13_Inheritance.Animals;

public class Main {
    public static void main(String[] args) {
        Animal an = new Animal("Animal", "sound");
        an.sound();
        Cat murka = new Cat("brown");
        Dog bobick = new Dog("black");
        Cow burenka = new Cow("Серо-бурая");

        Animal[] animals = new Animal[3];
        animals[0] = murka;
        animals[1] = bobick;
        animals[2] = burenka;

        for (Animal animal : animals) {
            System.out.println(animal.getColor());
        }

        soundAll(animals);

    }

    private static void sound(Animal animal) {
        switch (animal.getClassName()) {
            case "Cat" -> ((Cat) animal).meow();
            case "Dog" -> ((Dog) animal).woof();
            case "Cow" -> ((Cow) animal).moo();
            default -> System.out.println("Unknown animal");
        }
    }

    private static void soundAll (Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }

    }
}

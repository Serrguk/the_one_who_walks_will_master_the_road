package com.walking.lesson13_Inheritance.Animals;

public class Main {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.sound();
        Cat murka = new Cat("brown");
        Dog bobick = new Dog("black");
        Cow burenka = new Cow("Бурёнка", "Серо-бурая");

        Animal[] animals = new Animal[3];
        animals[0] = murka;
        animals[1] = bobick;
        animals[2] = burenka;

        for (Animal animal : animals) {
            animal.sound();
        }

        for (Animal animal : animals) {
            System.out.println(animal.getColor());
        }


    }
}

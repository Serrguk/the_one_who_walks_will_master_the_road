package com.walking.lesson19_ObjectMethods.Models;

import java.util.Arrays;

public class BaseOfCars {
    private Car[] cars;

    public BaseOfCars() {
        this.cars = new Car[0];
    }

    public void add(Car car) {
        Car[] newCars = new Car[cars.length + 1];
        System.arraycopy(cars, 0, newCars, 0, cars.length);
        newCars[newCars.length - 1] = car;
        cars = newCars;
    }

    public Car[] getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "BaseOfCars{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }
}

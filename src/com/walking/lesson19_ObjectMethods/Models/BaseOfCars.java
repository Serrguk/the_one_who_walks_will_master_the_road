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

    public void printAllCar() {
        for (Car car : cars) {
            System.out.println(car);
        }

    }

    public void search(String query) {
        if (query == null || query.trim().length() < 3) {
            System.out.println("Запрос должен содержать минимум 3 символа.");
            return;
        }
        
        boolean found = false;
        String lowerQuery = query.toLowerCase();

        for (Car car : cars) {
            if (car.getCarBrand().toString().toLowerCase().contains(lowerQuery) ||
                    car.getColor().toString().toLowerCase().contains(lowerQuery) ||
                    car.getRegNumber().toLowerCase().contains(lowerQuery)) {

                System.out.println(car);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Совпадений не найдено.");
        }
    }


    @Override
    public String toString() {
        return "BaseOfCars{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }
}

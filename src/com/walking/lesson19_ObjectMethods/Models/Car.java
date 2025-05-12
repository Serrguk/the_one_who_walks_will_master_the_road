package com.walking.lesson19_ObjectMethods.Models;

public class Car {
    private CarBrand carBrand;
    private String regNumber;

    public Car(CarBrand carBrand, String regNumber) {
        this.carBrand = carBrand;
        this.regNumber = regNumber;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return carBrand.toString();
    }
}

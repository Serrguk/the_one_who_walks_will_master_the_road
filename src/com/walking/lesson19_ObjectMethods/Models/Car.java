package com.walking.lesson19_ObjectMethods.Models;

public class Car {
    private CarBrand carBrand;
    private CarColor color;
    private String regNumber;

    public Car(CarBrand carBrand, CarColor color, String regNumber) {
        this.carBrand = carBrand;
        this.color = color;
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

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return carBrand
                + ", Color: "
                + color
                + ", Registration Number: "
                + regNumber;
    }
}

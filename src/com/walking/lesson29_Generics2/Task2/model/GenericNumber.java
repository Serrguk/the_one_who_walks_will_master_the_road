package com.walking.lesson29_Generics2.Task2.model;

public class GenericNumber<T extends Number> {
    private T value;

    public GenericNumber(T value) {
        this.value = value;
    }

    public Double pow(int power) {
        return Math.pow(value.doubleValue(), power);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        if (value == null) throw new IllegalArgumentException("Значение не может быть null");
        this.value = value;
    }
}

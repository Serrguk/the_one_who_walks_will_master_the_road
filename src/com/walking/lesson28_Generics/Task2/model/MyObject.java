package com.walking.lesson28_Generics.Task2.model;

public class MyObject<T> {
    private T value;

    public MyObject(T value) {
        this.value = value;
    }

    public boolean isNull() {
        return value == null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value == null ? "null" : value.toString();
    }
}

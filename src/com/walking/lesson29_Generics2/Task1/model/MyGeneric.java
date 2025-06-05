package com.walking.lesson29_Generics2.Task1.model;

public class MyGeneric<T> {
    private final T field;

    public MyGeneric(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}

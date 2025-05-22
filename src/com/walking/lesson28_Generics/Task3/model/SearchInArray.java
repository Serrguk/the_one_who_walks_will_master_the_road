package com.walking.lesson28_Generics.Task3.model;

import com.walking.lesson28_Generics.Task3.exception.ElementNotFoundException;

import java.util.Objects;

public class SearchInArray<T>{
    private final T[] array;

    public SearchInArray(T[] array) {
        this.array = array;
    }

    public T search(T object) {
        for (T element : array) {
            if (Objects.equals(element, object)) {
                return element;
            }
        }
        throw new ElementNotFoundException();
    }
}
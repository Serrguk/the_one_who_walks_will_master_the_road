package com.walking.lesson28_Generics.Task3.exception;

public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException () {
        super("Элемент не найден.");
    }
}

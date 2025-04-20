package com.walking.lesson8_ClassesObjectsAndKeywordThis;

public class Counter {
    private final String name;
    private int value;

    // Конструктор с двумя параметрами
    public Counter(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Конструктор с одним параметром (значение по умолчанию = 0)
    public Counter(String name) {
        this(name, 0);
    }

    // Увеличить на 1
    public int increment() {
        return ++value;
    }

    // Уменьшить на 1
    public int decrement() {
        return --value;
    }

    // Увеличить на заданное значение
    public int increment(int amount) {
        value += amount;
        return value;
    }

    // Уменьшить на заданное значение
    public int decrement(int amount) {
        value -= amount;
        return value;
    }

    // Получить текущее значение
    public int getValue() {
        return value;
    }

    // Получить имя счетчика
    public String getName() {
        return name;
    }
}

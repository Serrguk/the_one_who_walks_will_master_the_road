package com.walking.lesson12_counterAggregation;

import java.util.ArrayList;
import java.util.List;

public class CounterService {

    private final List<Counter> counters = new ArrayList<>();

    // Добавить новый счётчик
    public void addMeter(Counter counter) {
        counters.add(counter);
    }

    // Получить список всех счётчиков
    public List<Counter> getAllMeters() {
        return new ArrayList<>(counters);
    }

    // Найти счётчик по названию
    public Counter getMeterByName(String name) {
        for (Counter counter : counters) {
            if (counter.getName().equalsIgnoreCase(name)) {
                return counter;
            }
        }
        return null; // или бросить исключение, если хочешь
    }

    // Увеличить показание на единицу
    public void increment(String name) {
        Counter counter = getMeterByName(name);
        if (counter != null) {
            counter.setValue(counter.getValue() + 1);
        }
    }

    // Увеличить показание на заданное значение
    public void increment(String name, double value) {
        Counter counter = getMeterByName(name);
        if (counter != null) {
            counter.setValue(counter.getValue() + value);
        }
    }

    // Сбросить показание до нуля
    public void reset(String name) {
        Counter counter = getMeterByName(name);
        if (counter != null) {
            counter.setValue(0);
        }
    }
}

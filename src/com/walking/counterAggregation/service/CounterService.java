package com.walking.counterAggregation.service;

import com.walking.counterAggregation.counter.Counter;

public class CounterService {
    private static final String NO_COUNTER = "Нет счётчика с таким названием!";

    public void getAllCounters() {
        for (Counter counter : Counter.counters) {
            System.out.println(counter);
        }
    }
    public void incrementReading(String name) {
        for (Counter counter : Counter.counters) {
            if (counter.getName().equals(name)) {
                counter.setReadings(counter.getReadings() + 1.0);
                break;
            } else {
                System.out.println(NO_COUNTER);
            }
        }
    }
    public void resetCounter(String name) {
        for (Counter counter : Counter.counters) {
            if (counter.getName().equals(name)) {
                counter.setReadings(0.0);
                break;
            } else {
                System.out.println(NO_COUNTER);
            }
        }

    }
}

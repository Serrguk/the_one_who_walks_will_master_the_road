package com.walking.counterAggregation.counter;

import java.util.ArrayList;

public class Counter {
    private final String name;
    private double readings;
    private final String units;
    public static ArrayList<Counter> counters = new ArrayList<>();

    public Counter(String name, String units) {
        this.name = name;
        this.units = units;
        readings = 0.0;
        counters.add(this);
    }

    public double getReadings() {
        return readings;
    }

    public void setReadings(double readings) {
        this.readings = readings;
    }

    public String getName() {
        return name;
    }

    public String getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return "Счётчик: " + name + " "
                + readings +
                " " + units;
    }
}

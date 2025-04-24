package com.walking.lesson12_counterAggregation;

public class Counter {
    private final String name;
    private double value;
    private final String unit;

    public Counter(String name, double value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}


package com.walking.lesson12_counterAggregation;

public class Counter {
    private final String name;
    private double value;
    private final Unit unit;

    public Counter(String name, double value, Unit unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    public String getUnit() {
        return unit.getDisplayName();
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


package com.walking.lesson12_counterAggregation;

public enum Unit {
    CUBIC_METER("м³"),
    KILOWATT_HOUR("кВт·ч"),
    LITER("л"),
    KILOGRAM("кг"),
    TON("т");

    private final String displayName;

    Unit(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}


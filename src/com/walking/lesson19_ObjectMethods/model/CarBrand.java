package com.walking.lesson19_ObjectMethods.model;

public enum CarBrand {
    LADA ("Lada"),
    TOYOTA ("Toyota"),
    KIA ("Kia"),
    NISSAN ("Nissan"),
    ZEEKR ("Zeekr"),
    FORD ("Ford"),
    LEXUS ("Lexus"),
    MAZDA ("Mazda"),
    HYUNDAI ("Hyundai"),
    HONDA ("Honda");

    private final String displayName;

    CarBrand(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    public static CarBrand fromString(String name) {
        for (CarBrand brand : CarBrand.values()) {
            if (brand.displayName.equalsIgnoreCase(name)) {
                return brand;
            }
        }
        throw new IllegalArgumentException("Неизвестная марка: " + name + ". Убедитесь в корректности ввода.");
    }
}

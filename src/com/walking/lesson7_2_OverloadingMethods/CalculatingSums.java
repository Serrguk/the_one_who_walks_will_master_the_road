package com.walking.lesson7_2_OverloadingMethods;

public class CalculatingSums {

    public static Byte sum(Byte a, Byte b) {
        int sum = a + b;
        if (sum > Byte.MAX_VALUE) {
            System.out.println("Угроза потери данных: значение переполнено");
            return (byte) (a + b);
        }
        return (byte) (a + b);
    }

    public static Short sum(Short a, Short b) {
        int sum = a + b;
        if (sum > Short.MAX_VALUE) {
            System.out.println("Угроза потери данных: значение переполнено");
            return (short) (a + b);
        }
        return (short) (a + b);
    }

    public static Integer sum(Integer a, Integer b) {
        long sum = (long) a + (long) b;
        if (sum > Integer.MAX_VALUE) {
            System.out.println("Угроза потери данных: значение переполнено");
            return (a + b);
        }
        return (a + b);
    }
}

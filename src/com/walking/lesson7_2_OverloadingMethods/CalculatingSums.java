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

    public static Long sum(Long a, Long b) {
        long sum = a + b;
        if (a > Long.MAX_VALUE - b) {
            System.out.println("Угроза потери данных: значение переполнено");
            return sum;
        }
        return sum;
    }

    public static Float sum(Float a, Float b) {
        double sum = a + b;
        if (sum > Float.MAX_VALUE) {
            System.out.println("Угроза потери данных: значение переполнено");
            return (float)sum;
        }
        return (float)sum;
    }

    public static Double sum(Double a, Double b) {
        double sum = a + b;
        if (a > Double.MAX_VALUE - b) {
            System.out.println("Угроза потери данных: значение переполнено");
            return sum;
        }
        return sum;
    }

    public static Boolean sum(Boolean a, Boolean b) {
        return a && b;
    }

    public static String sum(Character... a) {
        StringBuilder builder = new StringBuilder();
        for (Character c : a) {
            builder.append(c);
        }
        return builder.toString();
    }
}

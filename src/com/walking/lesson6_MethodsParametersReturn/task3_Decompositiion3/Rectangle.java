package com.walking.lesson6_MethodsParametersReturn.task3_Decompositiion3;

public class Rectangle {
    public static final String CORNER = " ";
    public static final String HORIZONTAL_LINE = "—";
    public static final String VERTICAL_LINE = "|";

    static void draw(int x, int y) {
        topAndDown(x);
        for (int i = 0; i < y; i++) {
            leftAndRight(x);
        }
        topAndDown(x);
    }

    private static void topAndDown(int x) {
        String topAndDown = CORNER +
                HORIZONTAL_LINE.repeat(Math.max(0, x)) +
                CORNER;
        System.out.println(topAndDown);
    }

    private static void leftAndRight(int x) {
        String leftAndRight = VERTICAL_LINE + " ".repeat(Math.max(0, x)) +
                VERTICAL_LINE;
        System.out.println(leftAndRight);
    }
}

package com.walking.lesson4_Cycles.task3_DrawingRectangle;

import java.util.Scanner;

public class Main {
    public static final String CORNER = " ";
    public static final String HORIZONTAL_LINE = "—";
    public static final String VERTICAL_LINE = "|";
    public static void main(String[] args) {
        // TODO: Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
        //  Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
        //  Углы прямоугольника обозначить символом “ “.
        //  Каждая единица длины должна обозначаться одним символом “-“,
        //  каждая единица ширины – символом “|“.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        scanner.close();

        draw(x, y);
    }
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

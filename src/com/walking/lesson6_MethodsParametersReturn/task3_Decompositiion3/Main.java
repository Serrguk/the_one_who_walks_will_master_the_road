package com.walking.lesson6_MethodsParametersReturn.task3_Decompositiion3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO: Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
        //  Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
        //  Углы прямоугольника обозначить символом “ “.
        //  Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
        //  Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        scanner.close();

        Rectangle.draw(x, y);
    }
}

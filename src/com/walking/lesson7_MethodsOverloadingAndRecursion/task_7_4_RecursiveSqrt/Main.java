package com.walking.lesson7_MethodsOverloadingAndRecursion.task_7_4_RecursiveSqrt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int input = scanner.nextInt();
        scanner.close();
        System.out.println(nestedRoots(input));
    }

    static double nestedRoots(int a) {
        if (a < 0) {
            System.out.println("Число должно быть положительным");
            return 0;
        }
        return calculate(1, a);
    }

    static double calculate(int number, int maxNumber) {
        if (number == maxNumber) {
            return Math.sqrt(number);
        }
        return Math.sqrt(number + calculate(number + 1, maxNumber));
    }
}

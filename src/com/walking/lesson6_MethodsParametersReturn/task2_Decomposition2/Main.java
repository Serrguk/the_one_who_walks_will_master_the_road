package com.walking.lesson6_MethodsParametersReturn.task2_Decomposition2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO: Декомпозировать задачу
        //  https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task4.java
        //  Вынести в отдельный метод логику, которая отрабатывает, когда первое число кратно и двум, и трем.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        scanner.close();

        action(a, b);
    }

    private static void isEvenOrMultipleOfThree(int a, int b) {
        if (a % 2 == 0 || b % 3 == 0) {
            System.out.println("Результат сравнения чисел: " + (a == b));
        }
    }

    private static double isMultipleOfSix(int a, int b) {
        double result = 0;
        if (a % 6 == 0) {
            result = Math.pow(a, b);
        }
        return result;
    }

    private static void pow(int a, int b) {
        if (isMultipleOfSix(a, b) > Integer.MAX_VALUE || isMultipleOfSix(a, b) < Integer.MIN_VALUE) {
            System.out.println("Результат выражения слишком большой!");
        } else {
            System.out.println((int) isMultipleOfSix(a, b));
        }
    }

    static void action(int a, int b) {
        isEvenOrMultipleOfThree(a, b);
        double result = isMultipleOfSix(a, b);
        if (result == 0) {
            System.out.println("Число а не кратно 6, результат " + result);
        } else {
            pow(a, b);
        }
    }
}

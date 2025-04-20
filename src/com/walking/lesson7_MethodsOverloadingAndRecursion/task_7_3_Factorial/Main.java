package com.walking.lesson7_MethodsOverloadingAndRecursion.task_7_3_Factorial;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    private static int factorial(int a) {
        if (a < 0) {
            System.out.println("Факториала отрицательного числа не существует!");
            return -1; // или выбросить исключение
        } else if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
}

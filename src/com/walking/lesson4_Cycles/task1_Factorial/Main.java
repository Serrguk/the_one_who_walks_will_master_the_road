package com.walking.lesson4_Cycles.task1_Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Ввести с клавиатуры целое число. Вывести в консоль его факториал.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        System.out.println(factorial(input));
    }
    static long factorial(long a) {
        if (a < 0) {
            System.out.println("Факториала отрицательного числа не существует!");
            return a;
        } else if (a == 0) {
            return 1;
        } else if (a == 1) {
            return 1;
        } else {
            a *= factorial(a - 1);
        }
        return a;
    }
}

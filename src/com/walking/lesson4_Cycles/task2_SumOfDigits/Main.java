package com.walking.lesson4_Cycles.task2_SumOfDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int input = scanner.nextInt();
        scanner.close();
        System.out.printf("Сумма цифр числа %d равна: %d", input, sumOfDigits(input));
    }

    static int sumOfDigits(int a) {
        if (a < 0) {
            a *= -1;
        }
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}

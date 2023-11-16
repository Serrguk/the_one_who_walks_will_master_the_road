package com.walking.lesson4_Cycles.task5_GuessingGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Выводить на экран "Не угадал!" до тех пор, пока с клавиатуры не будет введено число 1.
        //  Запрашивать число с клавиатуры:
        //  Вариант 1: перед выводом на экран "Не угадал!"
        //  Вариант 2: после вывода на экран "Не угадал!"
        //  Подумать, где стоило бы использовать цикл do-while, а где – нет.
        gameWithDoWhile();
        gameWithWhile();

    }
    static void gameWithWhile() {
        Scanner scanner = new Scanner(System.in);
        int input;

        while(true) {
            System.out.print("Введи число: ");
            input = scanner.nextInt();
            if (input == 1) {
                break;
            }
            System.out.println("Не угадал!");
        }
        scanner.close();
        System.out.println("Угадал! Цифра 1!");
    }

    static void gameWithDoWhile() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Не угадал!");
            input = scanner.nextInt();
        } while (input != 1);
        System.out.println("Угадал! Цифра 1!");
    }
}

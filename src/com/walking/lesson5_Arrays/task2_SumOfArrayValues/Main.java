package com.walking.lesson5_Arrays.task2_SumOfArrayValues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Создать массив int’ов из 5 элементов.
        //  Заполнить его значениями, введенными с клавиатуры.
        //  Вывести на экран сумму каждого значения с предыдущим.
        //  Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.println(array[0] + array[array.length - 1]);
            } else {
                System.out.println(array[i] + array[i - 1]);
            }
        }
    }
}

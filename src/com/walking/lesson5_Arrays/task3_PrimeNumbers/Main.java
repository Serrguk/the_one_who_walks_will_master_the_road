package com.walking.lesson5_Arrays.task3_PrimeNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO: Вычислить и записать в массив первые 10 простых чисел.
        //  Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1.
        //  1 не является простым числом.
        //  Вывести в консоль сумму всех элементов полученного массива.

        int[] primeNumbers = new int[10];

        int count = 0;

        for (int i = 2; count < primeNumbers.length; i++) {
            if (isPrime(i)) {
                primeNumbers[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(primeNumbers));
        System.out.println(Arrays.stream(primeNumbers).sum());

    }

    static boolean isPrime(int i) {
        boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return isPrime;
    }
}

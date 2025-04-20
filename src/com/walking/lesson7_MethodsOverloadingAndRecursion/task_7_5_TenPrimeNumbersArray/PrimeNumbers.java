package com.walking.lesson7_MethodsOverloadingAndRecursion.task_7_5_TenPrimeNumbersArray;

public class PrimeNumbers {

    // Рекурсивный метод для нахождения первых n простых чисел
    public static int[] findPrimes(int n) {
        int[] primes = new int[n]; // Массив для хранения простых чисел
        return findPrimesHelper(n, primes, 0, 2); // Запуск рекурсивного поиска
    }

    private static int[] findPrimesHelper(int n, int[] primes, int index, int candidate) {
        // Базовый случай: если найдено n простых чисел, возвращаем массив
        if (index == n) {
            return primes;
        }

        // Если candidate простое число, добавляем его в массив
        if (isPrime(candidate, 2)) {
            primes[index] = candidate;
            index++;
        }

        // Рекурсивно вызываем метод для следующего числа
        return findPrimesHelper(n, primes, index, candidate + 1);
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int num, int divisor) {
        if (num <= 2) {
            return num == 2;
        }
        if (num % divisor == 0) {
            return false;
        }
        if (divisor * divisor > num) {
            return true;
        }
        return isPrime(num, divisor + 1);
    }
}
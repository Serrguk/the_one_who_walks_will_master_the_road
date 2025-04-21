package com.walking.lesson10_FieldsKeywordStaticConstants;

public class PrimeNumbers {
    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
//    заполнения одного элемента массива
    int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    static boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }
}

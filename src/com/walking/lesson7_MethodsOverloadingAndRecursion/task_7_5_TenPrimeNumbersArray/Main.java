package com.walking.lesson7_MethodsOverloadingAndRecursion.task_7_5_TenPrimeNumbersArray;

public class Main {
    public static void main(String[] args) {


        int[] primes = PrimeNumbers.findPrimes(10);

        for (int prime : primes) {
            System.out.print(prime + " ");
        }

        int sum = ArraySum.sumArray(primes);
        System.out.println("\nСумма элементов массива = " + sum);
    }
}

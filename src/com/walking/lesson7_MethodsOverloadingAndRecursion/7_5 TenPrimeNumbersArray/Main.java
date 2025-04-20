package com.walking.lesson7_5_TenPrimeNumbersInArray;

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

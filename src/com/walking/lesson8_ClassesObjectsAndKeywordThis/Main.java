package com.walking.lesson8_ClassesObjectsAndKeywordThis;

public class Main {
    public static void main(String[] args) {

        Counter evenCounter = new Counter("Even Numbers");
        Counter oddCounter = new Counter("Odd Numbers");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increment();
            } else {
                oddCounter.increment();
            }
        }

        System.out.println(evenCounter.getName() + ": " + evenCounter.getValue());
        System.out.println(oddCounter.getName() + ": " + oddCounter.getValue());
    }
}

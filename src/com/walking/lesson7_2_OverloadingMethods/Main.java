package com.walking.lesson7_2_OverloadingMethods;

public class Main {
    public static void main(String[] args) {

        System.out.println(CalculatingSums.sum((byte)9, (byte) 120));
        System.out.println(CalculatingSums.sum((byte)9, (byte) 120));
        System.out.println(CalculatingSums.sum((byte)9, (byte) 120));
        System.out.println(CalculatingSums.sum(9, Integer.MAX_VALUE));
    }
}

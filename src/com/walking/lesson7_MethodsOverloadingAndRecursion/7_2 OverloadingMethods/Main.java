package com.walking.lesson7_2_OverloadingMethods;

public class Main {
    public static void main(String[] args) {

        System.out.println(CalculatingSums.sum((byte)9, (byte) 120));
        System.out.println(CalculatingSums.sum((short)9, Short.MAX_VALUE));
        System.out.println(CalculatingSums.sum(9000000034846168738L, 1202524563567356587L));
        System.out.println(CalculatingSums.sum(9, Integer.MAX_VALUE));
        System.out.println(CalculatingSums.sum(9F, Float.MAX_VALUE));
        System.out.println(CalculatingSums.sum(Double.MAX_VALUE, 9.0));
        System.out.println(CalculatingSums.sum('f', 't', 't', 'u'));
        System.out.println(CalculatingSums.sum(3 < 2, 1 == 4));

    }
}

package com.walking.lesson29_Generics2.Task2;

import java.util.Arrays;
import java.util.List;

public class Main {

    // TODO: Используя Задачу 1 из урока Generics. Часть I, реализуйте в Main метод,
    //  принимающий аргументом объект подходящего для дженерика типа и возвращающий объект дженерика.
    //  Допустима параметризация только с использованием wildcard.

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(3.14, 2.71);

        Number n1 = getFirstNumber(integerList);
        Number n2 = getFirstNumber(doubleList);

        System.out.println(n1 + "\n" + n2);
    }

    public static Number getFirstNumber(List<? extends Number> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }
}

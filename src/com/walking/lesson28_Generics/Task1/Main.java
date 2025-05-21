package com.walking.lesson28_Generics.Task1;

public class Main {

    // TODO: Создать обобщенный тип, принимающий в себя любого из наследников Number.
    //  Создать метод, возводящий значение параметризованного типа в степень, переданную параметром в метод.

    public static void main(String[] args) {

        GenericNumber<Double> pi = new GenericNumber<>(3.14159);
        GenericNumber<Integer> value = new GenericNumber<>(354);

        System.out.println(pi.pow(3));
        System.out.println(value.pow(2));
        System.out.println(value.getValue());
    }
}

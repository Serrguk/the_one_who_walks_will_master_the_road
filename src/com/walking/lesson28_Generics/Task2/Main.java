package com.walking.lesson28_Generics.Task2;

import com.walking.lesson28_Generics.Task2.model.MyObject;

public class Main {

    // TODO: Создать класс-обертку над объектом любого типа.
    //  Предусмотреть boolean-метод, проверяющий значение объекта на null.

    public static void main(String[] args) {
        MyObject<Object> object1 = new MyObject<>(null);
        MyObject<Integer> object2 = new MyObject<>(42);

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object2.isNull());
    }
}

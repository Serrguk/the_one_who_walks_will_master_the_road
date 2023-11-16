package com.walking.lesson5_Arrays.task1_MyName;

public class Main {
    public static void main(String[] args) {
        // TODO: Создать массив char, заполненный буквами своего имени в верном порядке.
        //  Используя этот массив, вывести свое имя в консоль.
        //  Вариант 1: не используя переменную типа String;
        //  Вариант 2: предварительно собрав значения массива в переменную типа String.
        //  Подсказка для варианта 2: создать пустую строку можно так: String s = “”;

        char[] nameChars = {'S', 'e', 'r', 'g', 'e', 'y'};
        for (Character c : nameChars) {
            System.out.print(c);
        }

        //Option 2

        System.out.println();
        String name = "";
        for (Character c : nameChars) {
            name = name.concat(String.valueOf(c));
        }
        System.out.println(name);
    }
}

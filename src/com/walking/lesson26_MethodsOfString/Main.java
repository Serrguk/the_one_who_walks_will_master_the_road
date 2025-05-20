package com.walking.lesson26_MethodsOfString;

import com.walking.lesson26_MethodsOfString.Models.UniqueWord;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // TODO: Реализуйте программу, принимающую с клавиатуры строку, содержащую слова, разделенные пробелом.
    //  Выведите в консоль количество уникальных слов в строке. Учтите, что строка может начинаться с пробела.
    //  Пример: Мама мыла раму мама рамы мыла. Пример строки
    //  В данном случае будем считать, что уникальных слов 6: мама, мыла, раму, рамы, пример, строки.
    //  Для упрощения допустим, что в строке не могут использоваться символы,
    //  отличные от пробела или русских/английский букв. Помните, что слово может быть введено в разных регистрах.

    public static void main(String[] args) {

        System.out.println("Введите строку: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<String> words = UniqueWord.getUniqueWords(input);

        System.out.printf("В строке %d уникальных слов:\n", words.size());
        int count = 1;
        for (String s : words) {
            System.out.println(count + ": " + s);
            count++;
        }
    }
}

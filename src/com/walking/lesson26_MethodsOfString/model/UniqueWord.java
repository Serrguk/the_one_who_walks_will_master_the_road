package com.walking.lesson26_MethodsOfString.model;

import java.util.ArrayList;

public class UniqueWord {

    public static ArrayList<String> getUniqueWords(String input) {
        String[] inputWords = input.split("[^a-zA-Zа-яА-ЯёЁ]+");

        ArrayList<String> words = new ArrayList<>();

        for (String word : inputWords) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        return removeDuplicates(words);
    }

    private static ArrayList<String> removeDuplicates(ArrayList<String> words) {
        // Аккуратность соблюдать требуется, юный подаван: метод изменяет входной список!

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            for (int j = i + 1; j < words.size(); j++) {
                if (word.equalsIgnoreCase(words.get(j))) {
                    words.remove(j);
                    j--;
                }
            }
        }
        return words;
    }
}

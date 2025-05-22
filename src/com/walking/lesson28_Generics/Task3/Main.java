package com.walking.lesson28_Generics.Task3;

import com.walking.lesson28_Generics.Task3.model.SearchInArray;

public class Main {

    // TODO: Реализовать класс для работы с массивом.
    //  Разработать метод, производящий поиск значения в массиве.
    //  Если значение не найдено — выбрасывать исключение. Если найдено — возвращать его.

    public static void main(String[] args) {

        String[] strings = {"a", "b", "c", "d", "e", "f", "g"};
        SearchInArray<String> search = new SearchInArray<>(strings);

        System.out.println(search.search("k"));
    }
}

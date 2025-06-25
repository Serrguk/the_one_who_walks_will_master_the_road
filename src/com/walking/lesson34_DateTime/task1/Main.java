package com.walking.lesson34_DateTime.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    // TODO: Реализуйте метод, возвращающий объект LocalDateTime на основании переданной строки.
    //  Пример входящей строки: 20.12.2022 20:16:00.

    public static void main(String[] args) {

        String input = "20.12.2022 20:16:00";

        System.out.println(getDateTime(input));
    }

    static LocalDateTime getDateTime(String input) {
        return LocalDateTime.parse(input, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }
}

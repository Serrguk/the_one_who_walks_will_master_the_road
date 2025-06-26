package com.walking.lesson34_DateTime.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    // TODO: Реализуйте программу, выводящую в консоль сообщение,
    //  являются ли введенные с клавиатуры дата и время больше или меньше текущего.
    //  Формат вводимых даты и времени рекомендую взять из Задачи 1.

    public static void main(String[] args) {

        System.out.println("Введите дату и время в формате 25.12.2020 11:30 ");
        Scanner scanner = new Scanner(System.in);

        String inputDate = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        try {
            LocalDateTime dateTime = LocalDateTime.parse(inputDate, formatter);
            LocalDateTime now = LocalDateTime.now();

            if (dateTime.isAfter(now)) {
                System.out.println("Введённая дата позже текущей!");
            } else {
                System.out.println("Введённая дата раньше текущей!");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка формата! Убедитесь, что ввод соответствует шаблону dd.MM.yyyy HH:mm");
        }
    }
}

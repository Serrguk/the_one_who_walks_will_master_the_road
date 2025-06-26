package com.walking.lesson34_DateTime.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    // TODO: Реализуйте программу, выводящую в консоль сообщение,
    //  являются ли введенные с клавиатуры дата и время больше или меньше текущего.
    //  Формат вводимых даты и времени рекомендую взять из Задачи 1.

    public static void main(String[] args) {

        System.out.println("Введите дату и время в формате 25.12.2020 11:30 ");
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        scanner.close();

        System.out.println((dateTime.isAfter(LocalDateTime.now()) ? "Введённая дата позже текущей!" : "Введённая дата раньше текущей!"));
    }
}

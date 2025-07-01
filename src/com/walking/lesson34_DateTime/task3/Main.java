package com.walking.lesson34_DateTime.task3;

import com.walking.lesson34_DateTime.task2.model.PeriodBetweenDates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    // TODO: Реализуйте программу, выводящую в консоль количество времени
    //  между двумя введенными с клавиатуры датами и временем в секундах, минутах, часах, днях, месяцах и годах.

    public static void main(String[] args) {

        System.out.println("Введите первую дату в формате 25.12.2020 11:30: ");
        Scanner scanner = new Scanner(System.in);
        String date1 = scanner.nextLine();
        System.out.println("Введите вторую дату в формате 25.12.2020 11:30: ");
        String date2 = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        LocalDateTime dateTime1 = LocalDateTime.parse(date1, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(date2, formatter);

        PeriodBetweenDates.getPeriod(dateTime1, dateTime2);
    }
}

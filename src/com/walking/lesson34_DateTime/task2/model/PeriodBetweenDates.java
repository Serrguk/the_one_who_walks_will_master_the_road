package com.walking.lesson34_DateTime.task2.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodBetweenDates {

    public static void getPeriod(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        long seconds = Math.abs(Duration.between(dateTime1, dateTime2).getSeconds());
        long minutes = seconds / 60;
        long hours = minutes / 60;
        int days = (int) (hours / 24);

        LocalDate date1 = dateTime1.toLocalDate();
        LocalDate date2 = dateTime2.toLocalDate();

        Period period = Period.between(date1, date2);

        int months = Math.abs(period.getMonths());
        int years = Math.abs(period.getYears());

        System.out.printf("""
                Seconds: %d
                Minutes: %d
                Hours: %d
                Days: %d
                Months: %d
                Years: %d
                """, seconds, minutes, hours, days, months, years);

        System.out.println("Summary: " + getSummary(dateTime1, dateTime2));

    }

    private static String getSummary(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        Period period = Period.between(dateTime1.toLocalDate(), dateTime2.toLocalDate());

        LocalDateTime intermediate = dateTime1.plusYears(period.getYears()).plusMonths(period.getMonths()).plusDays(period.getDays());

        Duration duration = Duration.between(intermediate, dateTime2);

        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        return String.format("%d лет, %d месяцев, %d дней, %d часов, %d минут и %d секунд%n",
                years, months, days, hours, minutes, seconds);
    }
}

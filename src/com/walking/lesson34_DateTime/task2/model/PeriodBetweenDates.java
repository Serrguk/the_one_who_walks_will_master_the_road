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
                        Years: %d""",
                seconds, minutes, hours, days, months, years);
    }

}

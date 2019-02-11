package com.musala.javacourse181112.datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by Iva Koleva on 31.01.2019
 */
public class DateTimeApiAdjustSample {
    public static void main(final String[] args) {
        System.out.println(
                YearMonth.now().adjustInto(LocalDateTime.now()));
        /*System.out.println(
                LocalDateTime.now().adjustInto(YearMonth.now())); <-- sufficient temporal data requird*/

        System.out.println(
                TemporalAdjusters
                        .dayOfWeekInMonth(1, DayOfWeek.MONDAY)
                        .adjustInto(LocalDateTime.now()));
    }
}

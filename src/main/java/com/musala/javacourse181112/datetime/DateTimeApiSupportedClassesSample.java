package com.musala.javacourse181112.datetime;

import java.time.*;
import java.time.temporal.ChronoField;

/**
 * Created by Iva Koleva on 31.01.2019
 */
public class DateTimeApiSupportedClassesSample {
    public static void main(final String[] args) {
        System.out.println(
                ZonedDateTime.now());

        System.out.println(
                OffsetDateTime.now());

        System.out.println(
                OffsetTime.now());

        System.out.println(
                LocalDateTime.now());

        System.out.println(
                LocalTime.now());

        System.out.println(
                LocalDate.now());

        System.out.println(
                Year.now());

        System.out.println(
                YearMonth.now());

        System.out.println(
                Month.JUNE);
        System.out.println(
                YearMonth.now().getMonth());

        System.out.println(
                MonthDay.now());

        System.out.println(
                DayOfWeek.MONDAY);
        System.out.println(
                LocalDate.now().get(ChronoField.DAY_OF_WEEK));

        System.out.println(
                Instant.now());
        System.out.println(
                Instant.now().toEpochMilli());


        System.out.println(
                Period.between(LocalDate.now().with(ChronoField.YEAR, 2015), LocalDate.now()));
        System.out.println(
                Period.between(LocalDate.now().with(ChronoField.YEAR, 2025), LocalDate.now()));
        System.out.println(
                Period.parse("P4Y").plusDays(4));

        System.out.println(
                Duration.between(LocalDateTime.now(), LocalDateTime.now().plusMonths(1)));


        System.out.println(
                Clock.systemDefaultZone());
        System.out.println(
                Clock.offset(Clock.systemDefaultZone(), Duration.ofHours(3)));
        System.out.println(
                Clock.systemDefaultZone().instant().toEpochMilli());
    }
}

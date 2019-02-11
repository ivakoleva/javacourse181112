package com.musala.javacourse181112.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by Iva Koleva on 31.01.2019
 */
public class DateTimeApiPrefixesSample {
    private static final DateTimeFormatter CUSTOM_DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd' asd 'HH:mm");

    // API is immutable in general
    public static void main(final String[] args) {
        final LocalDateTime localDateTime = LocalDateTime.now();

        // construct by single values
        System.out.println(
                LocalDateTime.of(2018, 1, 1, 0, 0, 0));

        // extract
        System.out.println(
                LocalDate.from(LocalDateTime.now()));
        /*System.out.println(
                LocalDateTime.from(LocalDate.now())); <- needs sufficient temporal information */

        // parse from char sequence
        System.out.println(
                LocalDateTime.parse("2019-01-01T20:00:00"));
        System.out.println(
                LocalDateTime.parse(
                        "2011-12-03T10:15:30+01:00[Europe/Paris]",
                        DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(
                LocalDateTime.parse(
                        "2011-12-03 asd 10:15",
                        //DateTimeFormatter.ofPattern("yyyy-MM-dd' asd 'HH:mm")));
                        CUSTOM_DATE_TIME_FORMATTER));


        // temporal object to string
        System.out.println(
                LocalDateTime.now().format(
                        //DateTimeFormatter.ofPattern("yyyy-MM-dd' asd 'HH:mm")));
                        CUSTOM_DATE_TIME_FORMATTER));

        // get a field of the whole temporal object
        System.out.println(
                LocalDateTime.now().get(ChronoField.DAY_OF_YEAR));

        // comparison
        System.out.println(
                // isEquals, isBefore
                LocalDateTime.now().isAfter(LocalDateTime.of(2019, Month.JANUARY, 31, 17, 40)));

        // change fields by replacement
        System.out.println(
                LocalDateTime.now().with(ChronoField.YEAR, 2016));

        // change fields by calculation
        System.out.println(
                // .minus
                LocalDateTime.now().plus(1, ChronoUnit.WEEKS));

        // convert to temporal object of sufficient temporal data
        System.out.println(
                LocalDateTime.now().toLocalDate());
        System.out.println(
                LocalDateTime.now().toLocalTime());

        // combines this temporal object with another
        System.out.println(
            LocalDateTime.now().atZone(ZoneId.systemDefault()));
        System.out.println(
                LocalDateTime.now().atOffset(ZoneOffset.ofHours(-3)));

    }
}

package com.musala.javacourse181112.datetime;

import java.time.LocalDateTime;
import java.time.temporal.TemporalQueries;

/**
 * Created by Iva Koleva on 31.01.2019
 */
public class DateTimeApiQuerySample {
    public static void main(final String[] args) {
        System.out.println(
                TemporalQueries.localTime().queryFrom(LocalDateTime.now()));
    }
}

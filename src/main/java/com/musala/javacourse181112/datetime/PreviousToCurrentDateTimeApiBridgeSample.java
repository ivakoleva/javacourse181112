package com.musala.javacourse181112.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Created by Iva Koleva on 31.01.2019
 */
public class PreviousToCurrentDateTimeApiBridgeSample {
    public static void main(final String[] args) {
        System.out.println(
                ZonedDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()));

        System.out.println(
                new Date(ZonedDateTime.now().toInstant().toEpochMilli()));
    }
}

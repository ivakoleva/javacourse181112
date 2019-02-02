package com.musala.javacourse181112.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by Iva Koleva on 31.01.2019
 */
public class PreviousDateTimeApiSample {
    public static void main(final String[] args) {
        final Date date = new Date();
        date.setYear(1999 - 1900); // mutable; year always computed + 1900
        System.out.println(date);

        final Calendar calendar = new GregorianCalendar(2018, 0, 1);
        //calendar.setTime(new Date());
        System.out.println(
                calendar.getDisplayName(
                        Calendar.MONTH,
                        Calendar.LONG,
                        Locale.ENGLISH));
        System.out.println(
                Calendar.getInstance().getDisplayNames(
                        Calendar.MONTH,
                        Calendar.SHORT,
                        Locale.CHINESE));

        System.out.println(calendar.getTimeZone().getDisplayName());

        System.out.println();
    }
}

package com.musala.javacourse181112.oop.calculatorexercise;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Iva Koleva on 03.01.2019
 */
public final class Utils {
    private Utils() {
    }

    public static int calculateYearsFrom(final LocalDate localDate) {
        return Period.between(localDate, LocalDate.now()).getYears();
    }
}

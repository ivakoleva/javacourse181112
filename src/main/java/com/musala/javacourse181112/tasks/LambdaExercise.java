package com.musala.javacourse181112.tasks;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
    public static void main(final String[] args) {

        final Function<String, StringBuilder> stringToStringBuilder = (i) -> new StringBuilder(i);

        final Predicate<String> lengthString = s -> s.length() == 10;

    }
}

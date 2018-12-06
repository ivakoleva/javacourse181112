package com.musala.javacourse181112.tasks;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
        public static void main(final String[] args) {
            final Function<String,StringBuilder> castStringToStringBuilder = (string)->new StringBuilder(string);
            final Predicate<String> stringLengthPredicate = (checkedString)-> checkedString.length()==10;
        }
}

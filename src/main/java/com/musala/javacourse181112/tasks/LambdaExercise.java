package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
    public static void main(final String[] args) {
        // TODO: implement
        final int[] intArray = {1, 2, 3};
        Arrays.stream(intArray).forEach(i -> System.out.println(i + 1));
        Arrays.stream(intArray).forEach(System.out::println);
        final Function<String,StringBuilder> castStringToStringBuilder = (s)->new StringBuilder(s);

        final Predicate<String> stringLengthPredicate = (checkedString)-> checkedString.length()==10;

    }
}


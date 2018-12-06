package com.musala.javacourse181112.tasks;

import java.util.function.Function;

import java.util.function.Predicate;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
    public static void main(final String[] args) {

        final Function<String, StringBuilder> stringToStringBuilderFunction;
        stringToStringBuilderFunction = (s) -> new StringBuilder(s);

        final Predicate<String> stringLengthOf10=(s)-> s!=null && s.length()==10;
        System.out.println( stringLengthOf10.test("Hello Java"));
    }
}

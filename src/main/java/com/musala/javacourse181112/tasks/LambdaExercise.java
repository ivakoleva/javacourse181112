package com.musala.javacourse181112.tasks;

import java.util.function.Function;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
    private static final Object StringBuilder = new StringBuilder();
    public static void main(final String[] args) {
        // TODO: implement
        final Function<String, StringBuilder> stringToStringBuilderFunction = String -> StringBuilder;
        final String result = stringToStringBuilderFunction.apply(1);


    }
}

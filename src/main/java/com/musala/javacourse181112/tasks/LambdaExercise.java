package com.musala.javacourse181112.tasks;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
    public static void main(final String[] args) {

        final Function<String, StringBuilder> stringToStringBuilderFunction = StringBuilder::new;
        final Predicate<String> stringTestLenght10 = s -> s != null && s.length() == 10;
        System.out.println(stringTestLenght10.test("0123456789"));

    }
}

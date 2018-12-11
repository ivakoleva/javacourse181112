package com.musala.javacourse181112.tasks;

import java.util.function.Function;

public class LambdaExercise {
    public static void main(String[] args) {

        final Function<String, StringBuilder> castToStringBuilder = (i) -> new StringBuilder(i);

    }
}

package com.musala.javacourse181112.homeworks;

import java.util.function.Function;

public class LambdaExercise {
    public static void main(String[] args) {

        final Function<String, StringBuilder> castToStringBuilder = (i) -> new StringBuilder(i);

    }
}

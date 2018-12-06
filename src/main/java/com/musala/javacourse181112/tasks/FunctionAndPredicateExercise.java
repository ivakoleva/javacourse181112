package com.musala.javacourse181112.tasks;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPredicateExercise {

    public static void main(String[] args) {
        stringToStringBuilder();
        final Predicate<String> lengthCheck = bol -> bol.length() >= 10;
        System.out.println(lengthCheck.test("asdasdasd"));
    }

    public static void stringToStringBuilder() {
        final Function<String, StringBuilder> stringToStringBuilder = str -> {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                stringBuilder.append(str.charAt(i));
            }
            return stringBuilder;
        };
        final StringBuilder stringBuilder = stringToStringBuilder.apply("How Are you? ");
        System.out.println(stringBuilder);
    }
}


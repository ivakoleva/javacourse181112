package com.musala.javacourse181112.tasks;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
    public static void main(final String[] args) {

        final Function<String, StringBuilder> stringToStringBuilderFunction = stringInstance -> {
            StringBuilder stringBuilder = new StringBuilder(stringInstance);
            return stringBuilder;
        };

        final StringBuilder stringBuilder = stringToStringBuilderFunction.apply("Hello!");
        System.out.println(stringBuilder);

        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        final Predicate<String> stringLengthIsTen = s -> s != null && s.length() == 10;
        if (stringLengthIsTen.test(inputString)) {
            System.out.println("String has a length of 10.");
        }


    }
}

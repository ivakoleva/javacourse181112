package com.musala.javacourse181112.tasks;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Iva Koleva on 03.12.2018
 */
public class LambdaExercise {
    public static void main(final String[] args) {
        // TODO: implement

        final Function<String, StringBuilder> stringToStringBuilder = text -> {
            StringBuilder stringBuilder = new StringBuilder();
            //StringBuilder stringBuilder1 = new StringBuilder(text);
            for (int i =0; i < text.length(); i++){
                stringBuilder.append(text.charAt(i));
            }
            return stringBuilder;
        } ;

        final StringBuilder stringBuilder = stringToStringBuilder.apply("Hello");
        System.out.println(stringBuilder);

        final Predicate<String> lengthOfString = s -> s.length() == 10;
        System.out.println(lengthOfString.test("0123456789"));
        //System.out.println(lengthOfString.negate().test("0123456789"));// return !(test())
    }
}

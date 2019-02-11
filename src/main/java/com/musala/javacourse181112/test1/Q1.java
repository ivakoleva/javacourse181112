package com.musala.javacourse181112.test1;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 04.02.2019
 */

public class Q1 {
    // Complete the replaceNumbers function below.
    static List<String> replaceNumbers() {
        return IntStream.range(1, 101).boxed().map(i -> {
            if (multipleOf5.test(i) && multipleOf11.test(i)) {
                return "multipleOf_5_11";
            }
            if (multipleOf5.test(i)) {
                return "multipleOf_5";
            }
            if (multipleOf11.test(i)) {
                return "multipleOf_11";
            }
            return String.valueOf(i);
        }).collect(Collectors.toList());
    }

    private static final Predicate<Integer> multipleOf5 = i -> i % 5 == 0;

    private static final Predicate<Integer> multipleOf11 = i -> i % 11 == 0;

    public static void main(String[] args) throws IOException {
        System.out.println(
                replaceNumbers().stream().collect(Collectors.joining(" ")));
    }
}

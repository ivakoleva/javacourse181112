package com.musala.javacourse181112.test1;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 04.02.2019
 */
public class Q3 {
    private static BinaryOperator<Integer> calculateMaxSequence = (maxResult, counter) ->
            counter > maxResult ? counter - 1 : maxResult;

    static int decreasingSequence(final List<Integer> inputElements) {
        int maxResult = 1;
        int counter = 1;
        for (int i = 0; i < inputElements.size(); i++, counter++) {
            if (i > 0 && inputElements.get(i) >= inputElements.get(i - 1)) {
                maxResult = calculateMaxSequence.apply(maxResult, counter);
                counter = 1;
            }
        }
        return calculateMaxSequence.apply(maxResult, counter);
    }

    // sample test runner method
    public static void main(final String[] args) {
        System.out.println(decreasingSequence(IntStream.of(-12, -2, -1, 0, 4, 5, -1, 15).boxed().collect(Collectors.toList())));
    }
}

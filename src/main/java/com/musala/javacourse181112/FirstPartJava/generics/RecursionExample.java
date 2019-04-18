package com.musala.javacourse181112.FirstPartJava.generics;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class RecursionExample {
    public static final int ELEMENTS_COUNT = 3;

    public static void main(final String[] args) {
        final List<Object> triDimensionalIntegerList = generateListRecursive(3);
        System.out.println();
    }

    public static List<Object> generateListRecursive(final int depth) {
        switch (depth) {
            case 0:
                return Collections.emptyList();
            case 1:
                return IntStream.range(0, ELEMENTS_COUNT).boxed().collect(Collectors.toList());
        }
        return IntStream.range(0, ELEMENTS_COUNT).boxed()
                .map(i -> generateListRecursive(depth - 1)).collect(Collectors.toList());
    }
}

package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class GenericsTriDimensionalMatrixExercise {
    public static void main(final String[] args) {
        final int[][][] intArray =
                {
                        {
                                {1, 2, 3},
                                {1, 2, 3}
                        }
                };

        // TODO: using List, applying generics
        List<Object> triDimensionalIntegerArray = multidimensionalListMaker(3);
        System.out.println();

        // TODO: type elaboration ?
        final List<Object> triDimensionalIntegerList = generateListRecursive(3);
        System.out.println();
    }

    private final static int ELEMENTS_COUNT = 3;

    public static List<Object> multidimensionalListMaker(final int n) {
        if (n == 1) {
            final List<Object> objectList = new ArrayList<>();
            for (int i = 0; i < ELEMENTS_COUNT; i++) {
                objectList.add(i);
            }
            return objectList;
        }
        final List<Object> objectList = new ArrayList<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            objectList.add(multidimensionalListMaker(n - 1));
        }
        return objectList;
    }

    // alternative
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

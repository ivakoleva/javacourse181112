package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DeduplicationExercise {

    private final static List<Integer> INTEGER_LIST = IntStream.of(1, 2, 2, 3, 3, 3, 4)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new));

    public static void main(final String[] args) {

        deduplicateWithLambda();
        deduplicateWithoutLambda(INTEGER_LIST);
    }

    private static void deduplicateWithLambda() {
        List<Integer> integerList = INTEGER_LIST.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(integerList);
    }

    private static void deduplicateWithoutLambda(final List<Integer> integerList) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i : integerList) {
            if (!integerSet.contains(i)) {
                integerSet.add(i);
            }
        }
        System.out.println(integerSet);
    }
}

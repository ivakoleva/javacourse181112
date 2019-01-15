package com.musala.javacourse181112.tasks.Enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EnumerationExercise {
    public static void main(final String[] args) {
        final List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        final Enumeration<Integer> enumeration = Collections.enumeration(list);

        final List<Integer> list1 = new ArrayList<>();
        while (enumeration.hasMoreElements()) {
            final Integer nextElement = enumeration.nextElement();
            list1.add(nextElement);
            System.out.println(nextElement);
        }
        System.out.println();
    }
}

package com.musala.javacourse181112.tasks.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedHashSetExercise {
    public static void main(final String[] args) {
        // TODO: provide supplier on collect(), for reference: HashSetExercise
        final Set<Integer> integerSet = new LinkedHashSet<>(IntStream.range(0, 15)
                .boxed().collect(Collectors.toSet()));
        integerSet.add(15);

        System.out.println("Original LinkedHashSet: ");
        integerSet.forEach(System.out::println);

        System.out.println("The size is: " + integerSet.size());

        System.out.println("Removing 14 from LinkedHashSet: " + integerSet.remove(14));

        System.out.println("Checking if 8 is contain: " + integerSet.contains(8));

        System.out.println("LinkedHashSet after processing: " + System.lineSeparator() + integerSet);
    }
}

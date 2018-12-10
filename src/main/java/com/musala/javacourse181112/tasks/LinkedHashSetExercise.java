package com.musala.javacourse181112.tasks;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedHashSetExercise {
    public static void main(final String[] args) {
        final Set<Integer> integerLinkedHashSet = new LinkedHashSet<>(IntStream.range(0, 15)
                .boxed().map(i -> i).collect(Collectors.toSet()));
        integerLinkedHashSet.add(15);

        System.out.println("Original LinkedHashSet: ");
        integerLinkedHashSet.forEach(System.out::println);

        System.out.println("The size is: " + integerLinkedHashSet.size());

        System.out.println("Removing 14 from LinkedHashSet: " + integerLinkedHashSet.remove(14));

        System.out.println("Checking if 8 is contain: " + integerLinkedHashSet.contains(8));

        System.out.println("LinkedHashSet after processing: " + System.lineSeparator() + integerLinkedHashSet);
    }
}

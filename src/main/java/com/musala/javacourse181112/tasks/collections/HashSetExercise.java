package com.musala.javacourse181112.tasks.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// good
public class HashSetExercise {
    public static void main(final String[] args) {
        /*final Supplier<? extends Set<Integer>> collectionSupplier = () ->
                new HashSet<>(1024 * 1024);*/

        final Set<Integer> integerSet = IntStream
                .range(0, 5)
                .boxed()
                .map(i -> i + 1)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("Original list:");
        System.out.println(integerSet);

        System.out.println("Size of the list is: " + integerSet.size());

        System.out.println("Does the list contain five: " + integerSet.contains(5));

        System.out.println("Remove five from list ");
        integerSet.remove(5);

        System.out.println("Does the list contain five: " + integerSet.contains(5));

        System.out.println("List after processing");
        final Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("Delete all elements from the list");
        integerSet.clear();

        System.out.println("Is the list is empty: " + integerSet.isEmpty());
    }
}

package com.musala.javacourse181112.tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HashSetExercise {
    public static void main(final String[] args) {
        final Set<Integer> hashSetInteger = new HashSet<>(IntStream.range(0, 5).boxed().map(i -> i + 1).collect(Collectors.toSet()));

        System.out.println("Original list:");
        System.out.println(hashSetInteger);

        System.out.println("Size of the list is: " + hashSetInteger.size());

        System.out.println("Does the list contain five: " + hashSetInteger.contains(5));

        System.out.println("Remove five from list ");
        hashSetInteger.remove(5);

        System.out.println("Does the list contain five: " + hashSetInteger.contains(5));

        System.out.println("List after processing");
        final Iterator<Integer> iterator = hashSetInteger.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("Delete all elements from the list");
        hashSetInteger.clear();

        System.out.println("Is the list is empty: " + hashSetInteger.isEmpty());
    }
}

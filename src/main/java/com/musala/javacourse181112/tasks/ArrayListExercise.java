package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExercise {
    public static void main(final String[] args) {
        final List<Integer> arrayListInteger = new ArrayList<>(IntStream.range(0, 5).boxed()
                .map(i -> i + 1).collect(Collectors.toList()));
        arrayListInteger.add(6);

        System.out.println("The list is:");
        arrayListInteger.forEach(System.out::println);

        System.out.println("The size is: " + arrayListInteger.size());

        System.out.println("The element with index 3 is: " + arrayListInteger.get(3));

        System.out.println("SubList from index 0 to 3: " + arrayListInteger.subList(0, 4));

        System.out.println("Remove the element at index 2: ");
        arrayListInteger.remove(2);
        System.out.println("The after removing an item with index 2: " + System.lineSeparator() + arrayListInteger);

        final Predicate<Integer> equalsToFive = (p) -> (p == 5);
        System.out.println("Remove the element that is equal to five: " + arrayListInteger.removeIf(equalsToFive));
        System.out.println("The List after processing" + System.lineSeparator() + arrayListInteger);
    }
}

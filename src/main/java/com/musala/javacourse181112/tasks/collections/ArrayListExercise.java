package com.musala.javacourse181112.tasks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExercise {
    public static void main(final String[] args) {
        // TODO: provide supplier on collect(), for reference: HashSetExercise
        final List<Integer> integerList = new ArrayList<>(IntStream.range(0, 5).boxed()
                .map(i -> i + 1).collect(Collectors.toList()));
        integerList.add(6);

        System.out.println("The list is:");
        integerList.forEach(System.out::println);

        System.out.println("The size is: " + integerList.size());

        System.out.println("The element with index 3 is: " + integerList.get(3));

        System.out.println("SubList from index 0 to 3: " + integerList.subList(0, 4));

        System.out.println("Remove the element at index 2: ");
        integerList.remove(2);
        System.out.println("The after removing an item with index 2: " + System.lineSeparator() + integerList);

        final Predicate<Integer> equalsToFive = (p) -> (p == 5);
        System.out.println("Remove the element that is equal to five: " + integerList.removeIf(equalsToFive));
        System.out.println("The List after processing" + System.lineSeparator() + integerList);
    }
}

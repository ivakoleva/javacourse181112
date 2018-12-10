package com.musala.javacourse181112.tasks.collections;

import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeSetExercise {
    public static void main(final String[] args) {
        // TODO: provide supplier on collect(), for reference: HashSetExercise
        final TreeSet<Integer> integerTreeSet = new TreeSet<>(IntStream.range(0, 10).boxed().map(i -> i + 1).collect(Collectors.toSet()));
        integerTreeSet.add(11);
        integerTreeSet.forEach(System.out::println);

        System.out.println("The size is: " + integerTreeSet.size());

        final Predicate<Integer> biggerThanTwo = (element) -> (element > 2);
        System.out.println("Are all elements are bigger than two: " + integerTreeSet.stream().allMatch(biggerThanTwo));
        System.out.println("Is any element is bigger than two: " + integerTreeSet.stream().anyMatch(biggerThanTwo));

        System.out.println("Does the TreeSet contain 20: " + integerTreeSet.contains(20));

        System.out.println("The first element is: " + integerTreeSet.first());

        System.out.println("The last element is: " + integerTreeSet.last());

        System.out.println("Elements of TreeSet which are greater than or equal to 3: " + System.lineSeparator() +
                integerTreeSet.tailSet(3));

        System.out.println("Elements of TreeSet which are less than 7: " + System.lineSeparator() +
                integerTreeSet.headSet(7));
    }
}

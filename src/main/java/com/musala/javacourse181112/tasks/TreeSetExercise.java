package com.musala.javacourse181112.tasks;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TreeSetExercise {
    public static void main(final String[] args) {
        final Set<Integer> treeSetInteger = new TreeSet<>(IntStream.range(0, 10).boxed().map(i -> i + 1).collect(Collectors.toSet()));
        treeSetInteger.add(11);
        treeSetInteger.forEach(System.out::println);

        System.out.println("The size is: " + treeSetInteger.size());

        final Predicate<Integer> biggerThanTwo = (element) -> (element > 2);
        System.out.println("Are all elements are bigger than two: " + treeSetInteger.stream().allMatch(biggerThanTwo));
        System.out.println("Is any element is bigger than two: " + treeSetInteger.stream().anyMatch(biggerThanTwo));

        System.out.println("Does the TreeSet contain 20: " + treeSetInteger.contains(20));

        System.out.println("The first element is: " + ((TreeSet<Integer>) treeSetInteger).first());

        System.out.println("The last element is: " + ((TreeSet<Integer>) treeSetInteger).last());

        System.out.println("Elements of TreeSet which are greater than or equal to 3: " + System.lineSeparator() +
                ((TreeSet<Integer>) treeSetInteger).tailSet(3));

        System.out.println("Elements of TreeSet which are less than 7: " + System.lineSeparator() +
                ((TreeSet<Integer>) treeSetInteger).headSet(7));
    }
}

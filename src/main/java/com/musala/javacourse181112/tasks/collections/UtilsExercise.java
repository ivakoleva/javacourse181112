package com.musala.javacourse181112.tasks.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UtilsExercise {
    public static void main(String[] args) {
        final List<Integer> integerList = IntStream.range(0,10).boxed().collect(Collectors.toCollection(ArrayList::new));

        System.out.println("The list is:");
        System.out.println(integerList);

        System.out.println("Shuffle list");
        Collections.shuffle(integerList);
        System.out.println(integerList);

        System.out.println("Sorted list");
        Collections.sort(integerList);
        System.out.println(integerList);

        System.out.println("Reversed");
        Collections.reverse(integerList);
        System.out.println(integerList);

        final List<Integer> integerList2 = IntStream.range(0,101).boxed().map(i -> 10).collect(Collectors.toCollection(ArrayList::new));
        integerList2.add(1);
        integerList2.add(2);
        System.out.println("Second list:" + System.lineSeparator() + integerList2);


        final Set<Integer> integerSet = new HashSet<Integer>(integerList);
        integerSet.addAll(integerList2);
        System.out.println("Set " + System.lineSeparator() + integerSet);
    }
}

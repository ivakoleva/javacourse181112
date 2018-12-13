package com.musala.javacourse181112.tasks.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UtilsExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("The list is:");
        System.out.println(integerList);

        System.out.println("Shuffle list");
        /*final List<Integer> integerList2 = new ArrayList<>(integerList);
        Collections.shuffle(integerList2);*/
        Collections.shuffle(integerList);
        //integerList.stream().sorted()
        System.out.println(integerList);

        System.out.println("Sorted list");
        Collections.sort(integerList);
        //integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);

        System.out.println("Reversed");
        Collections.reverse(integerList);
        /*integerList.stream()
                //.sorted((i1, i2) -> i2.compareTo(i1))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());*/
        System.out.println(integerList);

        final List<Integer> integerList2 = IntStream.range(0, 101).boxed()
                .map(i -> 10)
                .collect(Collectors.toCollection(ArrayList::new));
        integerList2.add(1);
        integerList2.add(2);
        System.out.println("Second list:" + System.lineSeparator() + integerList2);

        final Set<Integer> integerSet = new HashSet<Integer>(integerList);
        integerSet.addAll(integerList2);
        System.out.println("Set " + System.lineSeparator() + integerSet);
    }
}

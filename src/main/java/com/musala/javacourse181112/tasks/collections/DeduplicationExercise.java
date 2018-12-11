package com.musala.javacourse181112.tasks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeduplicationExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new));
        integerList.add(1);
        integerList.add(2);
        integerList.add(1);
        integerList.add(1);
        integerList.add(3);
        integerList.add(0);
        integerList.add(1);
        integerList.add(50);
        integerList.add(10);
        integerList.add(1);
        integerList.add(1);

        System.out.println("The list before processing:");
        System.out.println(integerList);

        System.out.println("The list after processing");
        System.out.println(deduplicate(integerList));
        //System.out.println(doDeduplicateWithHashCode(integerList));
    }

    // TODO: modify while loop - using iterator
    // TODO: using functional interface
    private static List deduplicate(final List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = i + 1; j < integerList.size(); j++) {
                if (integerList.get(i).equals(integerList.get(j))) {
                    integerList.remove(j);
                }
            }
        }
        return integerList;
    }
}

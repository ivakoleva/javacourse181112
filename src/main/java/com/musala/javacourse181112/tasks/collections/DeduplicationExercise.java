package com.musala.javacourse181112.tasks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeduplicationExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new));
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(3);
        integerList.add(0);
        integerList.add(1);
        integerList.add(50);
        integerList.add(10);
        integerList.add(1);
        integerList.add(1);

        final List<Integer> integerListWithoutDuplicates = integerList.stream().distinct().
                collect(Collectors.toCollection(ArrayList::new));

        System.out.println("The list before processing:");
        System.out.println(integerList);

        System.out.println("The list after processing:");
        System.out.println(integerListWithoutDuplicates);
        System.out.println(doDeduplicate(integerList));
    }

    private static List doDeduplicate(final List<Integer> integerList) {
        final ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            final int nextIndex = listIterator.nextIndex();
            final Integer currentItem = listIterator.next();
            for (int i = 0; i < nextIndex; i++) {
                if (currentItem.equals(integerList.get(i))) {
                    listIterator.remove();
                }
            }
        }
        return integerList;
    }
}

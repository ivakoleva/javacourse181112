package com.musala.javacourse181112.tasks.CollectionExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UtilsExercise {
    public static void main(final String[] args) {
        final List<Integer> intList = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(intList);

        Collections.shuffle(intList);
        System.out.println(intList);

        Collections.sort(intList);
        Collections.reverse(intList);
        System.out.println(intList);

        final List<String> intList2 = IntStream.range(0, 100).boxed().map(i -> "Element").collect(Collectors.toCollection(ArrayList::new));
        System.out.println(intList2);

        final List<Object> concatList = new ArrayList<>();

        concatList.addAll(intList);
        concatList.addAll(intList2);
        System.out.println(concatList);


    }
}

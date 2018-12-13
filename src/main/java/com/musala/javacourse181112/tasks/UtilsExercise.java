package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UtilsExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        Collections.shuffle(integerList);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.reverse(integerList);
        System.out.println(integerList);

        final List<Integer> integerList1 = new ArrayList<>(Collections.nCopies(100, 1));                ;

        final List<Integer> resultList = Stream.concat(integerList.stream(), integerList1.stream())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(resultList);

    }
}

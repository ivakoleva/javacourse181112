package com.musala.javacourse181112;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0,10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(integerList);

        Collections.shuffle(integerList);
        System.out.println(integerList);

        Collections.sort(integerList);
        System.out.println(integerList);

        Collections.reverse(integerList);
        System.out.println(integerList);

        final List<Integer> secondIntegerList = Collections.nCopies(100, 1);
        Stream.concat(integerList.stream(), secondIntegerList.stream())
                .collect(Collectors.toList())
                .forEach(System.out::print);


    }
}

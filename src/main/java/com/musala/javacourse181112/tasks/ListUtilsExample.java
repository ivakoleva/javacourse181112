package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListUtilsExample {
    public static void main(String[] args) {
        final List<Integer> list = IntStream.range(0, 10).boxed()
                .map(i -> i * i).collect(Collectors.toList());

        list.forEach(System.out::println);

        Collections.reverse(list);
        System.out.println("--After Reverse--");
        list.forEach(System.out::println);

        Collections.shuffle(list);
        System.out.println("--After shuffle--");
        list.forEach(System.out::println);

        Collections.sort(list);
        System.out.println("--After Sort--");
        list.forEach(System.out::println);

    }
}

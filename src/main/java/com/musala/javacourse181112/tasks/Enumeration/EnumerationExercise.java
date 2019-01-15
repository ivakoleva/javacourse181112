package com.musala.javacourse181112.tasks.Enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EnumerationExercise {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        Enumeration<Integer> enumeration = Collections.enumeration(list);
        List<Integer> list1 = new ArrayList<>();
        for (; enumeration.hasMoreElements(); ) {
            Integer curEnum = enumeration.nextElement();
            list1.add(curEnum);
            System.out.println(curEnum);
        }
        System.out.println();
    }
}

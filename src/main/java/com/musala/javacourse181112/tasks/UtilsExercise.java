package com.musala.javacourse181112.tasks;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UtilsExercise {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.range(0,10)
                .boxed().collect(Collectors.toList());
        integerList.forEach(i-> System.out.print(i+" "));
        System.out.println("");
        Collections.shuffle(integerList);
        integerList.forEach(i-> System.out.print(i+" "));
        System.out.println("");
        Collections.sort(integerList);
        integerList.forEach(i-> System.out.print(i+" "));
        System.out.println("");
        Collections.reverse(integerList);
        integerList.forEach(i-> System.out.print(i+" "));
        System.out.println("");

        List<Integer> integerList2 = Collections.nCopies(100,1 );
        Stream.concat(integerList.stream(),integerList2.stream())
                .collect(Collectors.toList()).forEach(i -> System.out.print(i + " "));
    }
}

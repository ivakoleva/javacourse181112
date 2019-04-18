package com.musala.javacourse181112.FirstPartJava.tasks;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExercise {
    public static void main(String[] args) {
        final Map<String, String> mapSS = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toMap(
                        i -> "key" + i,
                        i -> "value" + i
                ));

        mapSS.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

       // Collections.shuffle(mapSS.entrySet().stream().map(Map.Entry::getKey));
        //li
    }
}

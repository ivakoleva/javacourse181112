package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapLooper {
    public static void main(String[] args) {
         final Map<Integer, Integer> integerIntegerMap = IntStream.range(0, 10)
                 .boxed()
                 .collect(Collectors.toMap(
                         k -> k + 1,
                         v -> v + 1
                 ));

        for (Map.Entry<Integer, Integer> entry : integerIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        for (int key : integerIntegerMap.keySet()) {
            System.out.println(key);
        }


        for (int value : integerIntegerMap.values()) {
            System.out.println(value);
    }
}}

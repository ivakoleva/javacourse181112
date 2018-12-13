package com.musala.javacourse181112;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExercise {
    public static void main(final String[] args) {
        final Map<String, String> stringMap = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toMap(
                        i -> "key" + i,
                        i -> "value" + i
                ));


        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        for (String key : stringMap.keySet()) {
            System.out.println(key);
        }


        for (String value : stringMap.values()) {
            System.out.println(value);
        }

    }
}

package com.musala.javacourse181112.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(final String[] args) {
        final Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("key1", "value1");
        stringStringMap.put("key2", "value2");

        final Map<String, String> stringStringMapGenerated = IntStream.range(0, 10)
                .boxed().collect(Collectors.toMap(
                        i -> "key" + i,
                        i -> "value" + i
                ));


    }
}
}

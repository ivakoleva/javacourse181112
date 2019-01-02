package com.musala.javacourse181112.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 06.12.2018
 */
public class MapExample {
    public static void main(final String[] args) {
        final Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("key1", "value1");
        stringStringMap.put("key2", "value2");
        stringStringMap.remove("key1");
        stringStringMap.remove("key2", "valueNonexistent");
        System.out.println(stringStringMap.size());

        final Map<String, String> stringStringMapGenerated = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toMap(
                        i -> "key" + i,
                        i -> "value" + i
                ));

        /*// loop on key-value pairs (map entries)
        for (Map.Entry<String, String> entry : stringStringMapGenerated.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // loop on keys only
        for (String key : stringStringMapGenerated.keySet()) {
            System.out.println(key);
        }

        // loop on values only
        for (String value : stringStringMapGenerated.values()) {
            System.out.println(value);
        }*/

        //System.out.println(stringStringMapGenerated.getOrDefault("keyNonexistent", "valueDefault"));

        //stringStringMapGenerated.replaceAll((k, v) -> v + ("key1".equals(k) ? "replaced." : ""));

        System.out.println();

    }
}

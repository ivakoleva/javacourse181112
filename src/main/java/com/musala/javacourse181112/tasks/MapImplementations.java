package com.musala.javacourse181112.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapImplementations {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        Iterator mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
        Map.Entry entry = (Map.Entry) mapIterator.next();
        System.out.println(entry.getKey() + " " + entry.getValue());
        }
        Iterator keyIterator = map.keySet().iterator();
        while (keyIterator .hasNext()){
            System.out.println(keyIterator.next());
        }
        Iterator valueMapIterator = map.values().iterator();
        while (valueMapIterator.hasNext()) {
            System.out.println(valueMapIterator.next());
        }
    }
}


package com.musala.javacourse181112.tasks.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map exercise - populate and traverse over Map:
//        *** keys
//        *** values
//        *** entries
public class MapExercise {
    public static void main(String[] args) {
        final Map<Integer, String> map = new HashMap();
        map.put(1, "Chair");
        map.put(2, "Table");
        map.put(3, "Desk");
        map.put(4, "Monitor");
        Set set = map.entrySet();
        Iterator mapIterator = set.iterator();
        while (mapIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) mapIterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        Iterator keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
        }
        Iterator valueMapIterator = map.values().iterator();
        while (valueMapIterator.hasNext()) {
            System.out.println(valueMapIterator.next());
        }
    }
}

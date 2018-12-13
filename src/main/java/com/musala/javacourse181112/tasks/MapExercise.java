package com.musala.javacourse181112.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExercise {
    public static void main(final String[] args) {
        final Map<Character, Integer> charToIntMap = new HashMap<>();
        for (char c = 24; c < 165; c += 3) {
            charToIntMap.put(c, (int) c);
            charToIntMap.forEach((k,v)-> System.out.print(k+"->"+v));
            System.out.println();
        }
        for(Character c:charToIntMap.keySet()){
            System.out.print(c+" ");
        }
        System.out.println();
        for(Integer i:charToIntMap.values()){
            System.out.print(i+" ");
        }
        System.out.println();
        // could be one-liner lambda
        final Iterator iteratorEntrySet = charToIntMap.entrySet().iterator();
        for (; iteratorEntrySet.hasNext(); ) {
            final Map.Entry<Character, Integer> i = (Map.Entry<Character, Integer>) iteratorEntrySet.next();
            final Character key = i.getKey();
            if ((key >= 'a' && key <= 'z')) { // could be predicate
                iteratorEntrySet.remove();
            }
        }

        charToIntMap.forEach((k, v) -> System.out.println(k + "->" + v));
        System.out.println();
    }
}

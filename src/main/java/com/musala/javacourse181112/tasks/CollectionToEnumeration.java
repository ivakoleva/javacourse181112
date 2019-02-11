package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class CollectionToEnumeration {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");

        Enumeration enumeration = Collections.enumeration(hashSet);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

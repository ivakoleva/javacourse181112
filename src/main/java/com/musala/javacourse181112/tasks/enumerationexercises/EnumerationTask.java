package com.musala.javacourse181112.tasks.enumerationexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationTask {
    public static void main(final String[] args) {

        List<String> stringList = new ArrayList<>();

        Enumeration<String> enumeration;

        stringList.add("String 1");
        stringList.add("String 2");

        enumeration = Collections.enumeration(stringList);

        ArrayList<String> stringList1 = Collections.list(enumeration);
        stringList1.forEach(System.out::println);

        while(enumeration.hasMoreElements()) {
            System.out.println("Enumeration: "+enumeration.nextElement());
        }
    }
}

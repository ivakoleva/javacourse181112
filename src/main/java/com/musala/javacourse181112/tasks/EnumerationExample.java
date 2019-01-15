package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Collections;

public class EnumerationExample {

    public static void main(String[] args) {

        final List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add("G");

        final Enumeration e = Collections.enumeration(arrayList);

        System.out.println("Arraylist to Enumeration");
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        final List<String> arrayList1 = Collections.list(e);
        System.out.println("List elements: "+ arrayList);
    }
}
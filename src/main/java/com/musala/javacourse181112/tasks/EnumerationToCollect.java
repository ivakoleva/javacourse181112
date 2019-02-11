package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationToCollect {
    public static void main(String[] args) {

// Create a Vector and populate it with elements
        Vector vector = new Vector();

        vector.add("element_1");
        vector.add("element_3");
        vector.add("element_4");
        vector.add("element_2");
        vector.add("element_5");

        System.out.println("Vector elements : " + vector);
        Enumeration elementsEnumeration = vector.elements();

        // static ArrayList list(Enumeration e) returns an ArrayList containing the elements
        // returned by the specified Enumeration

        ArrayList arrayList = Collections.list(elementsEnumeration);
        System.out.println("Arraylist elements : " + arrayList);
    }
}
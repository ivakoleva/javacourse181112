package com.musala.javacourse181112.tasks;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationCollection {
    public static void main(final String[] args) {

        List arrayList = new ArrayList();

        for (int i = 1; i <= 3; i++) {
            arrayList.add(i);
        }

        Enumeration e = Collections.enumeration(arrayList);
        while(e.hasMoreElements()) {
            System.out.println("Value is: "+e.nextElement());
        }

        List list = Collections.list(e);

    }
}

package com.musala.javacourse181112.tasks.oop_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class TransformatorCollectionToEnumeration {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("pink");
        stringList.add("blue");
        Enumeration<String> stringEnumeration = Collections.enumeration(stringList);
        while(stringEnumeration.hasMoreElements()){
            System.out.println(stringEnumeration.nextElement());
        }

        List<String> stringList1 = Collections.list(stringEnumeration);

    }
}

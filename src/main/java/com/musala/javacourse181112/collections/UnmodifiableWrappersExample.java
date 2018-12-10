package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class UnmodifiableWrappersExample {
    public static void main(final String[] args) {
        final List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        final List<Integer> unmodifiableIntegerList =
                Collections.unmodifiableList(integerList);

        // will throw an exception if method modifies the collection
        createReport(unmodifiableIntegerList);


        integerList.add(3);
        System.out.println("Post- createReport (and addition of an element):");
        integerList.forEach(System.out::println);
    }

    public static void createReport(final List<Integer> data) {
        data.forEach(System.out::println);

        // expected to be allowed to read for report only
        //data.remove(0);
    }
}

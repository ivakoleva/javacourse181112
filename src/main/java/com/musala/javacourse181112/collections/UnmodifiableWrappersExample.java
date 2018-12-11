package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableWrappersExample {
    public static void main(final String[] args) {
        final List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        final List<Integer> unmodifiableIntegerList = Collections.unmodifiableList(integerList);

        createReport(unmodifiableIntegerList);

        System.out.println("Post-createReport: ");

        integerList.add(3);
    }

    public static void createReport(final List<Integer> data) {
        data.forEach(System.out::print);
    }

}

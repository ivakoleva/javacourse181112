package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 06.12.2018
 */
public class ListExample {
    public static void main(final String[] args) {
        final List<String> stringList = new ArrayList<>();
        stringList.add("asd");
        stringList.add(0, "asdf");
        stringList.add("asd");

        stringList.forEach(System.out::println);

        System.out.println("indexOf asd: " + stringList.indexOf("asd"));
        System.out.println("lastIndexOf asd: " + stringList.lastIndexOf("asd"));

        System.out.println();
        stringList.subList(0, 2).forEach(System.out::println);

        stringList.remove("asd");
        stringList.remove(0);
        stringList.forEach(System.out::println);
    }
}

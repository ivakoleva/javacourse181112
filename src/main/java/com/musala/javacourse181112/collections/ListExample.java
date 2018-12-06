package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        final List<String> stringList = new ArrayList<>();
        stringList.add("asd");
        stringList.add(0, "string");

        stringList.forEach(System.out::println);
        System.out.println("indexOf asd: " + stringList.indexOf("asd"));
        System.out.println("lastIndexOf asd: " + stringList.lastIndexOf("asd"));

        stringList.remove("ads");
        stringList.remove(0);

    }
}

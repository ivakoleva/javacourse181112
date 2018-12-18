package com.musala.javacourse181112.tasks.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardBridgeExercise {
    private final static List<?> unknownList = new ArrayList<>();

    private static void addNumber(List<? super Number> list, Number element) {
        list.add(element);
    }

    private static void addElement(List<? super Object> list, Object element) {
        list.add(element);
    }

    private static <T> List bridgeMethod(final List<? extends T> list) {

        return new ArrayList(list);
    }

    private static void printList(final List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(final String[] args) {

        addElement((List<? super Object>) unknownList, 10);
        addElement((List<? super Object>) unknownList, 12);
        addElement((List<? super Object>) unknownList, 15f);
        addElement((List<? super Object>) unknownList, 11L);
        addElement((List<? super Object>) unknownList, "hello");

        addNumber((List<? super Number>) unknownList, 10);
        addNumber((List<? super Number>) unknownList, 15d);

        System.out.println("Bridge method: " + bridgeMethod(unknownList));

        System.out.println("The list is: ");
        printList(unknownList);
    }
}

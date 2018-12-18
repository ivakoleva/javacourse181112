package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.List;

public class WildcardBridge {
    private final static List<?> WILDCARD_LIST = new ArrayList<>();
    private final static List<Object> OBJECT_LIST = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(bridge(WILDCARD_LIST, OBJECT_LIST));
    }

    private static <T> List<T> bridge(List<? extends T> source, List<? super T> destination) {
        for (int i = 0; i < source.size(); i++) {
            destination.set(i, source.get(i));
        }
        return new ArrayList<>();
    }
}

package com.musala.javacourse181112.tasks;

import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(100, 1);
        System.out.println(integerList.size()); // index out of bounds
    }
}

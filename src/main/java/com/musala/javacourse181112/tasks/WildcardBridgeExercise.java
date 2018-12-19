package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WildcardBridgeExercise {

    public static void main(String[] args) {
        List<?> wildList = new ArrayList<>();
        addAndPrintObject((List<Integer>) wildList);
        creatingSet();
    }

    public static void addAndPrintObject(List<Integer> wildList) {
        wildList.add(1);
        System.out.println(wildList.get(0));
    }

    public static void creatingSet() {
        Set<Number> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2L);
        numberSet.add((short) 3);
        numberSet.add(1.2);
        numberSet.add(3.4F);
        numberSet.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}

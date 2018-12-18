package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.List;

public class WildcardBridgeExercise {
    public static void main(String[] args) {
        List<?> wildCard = new ArrayList<>();
        addAndPrintInteger((List<Integer>)wildCard);
    }
    public static void addAndPrintInteger(List<Integer> wildList) {
        wildList.add(1);
        System.out.println(wildList.get(0));
    }
}

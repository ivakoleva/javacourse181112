package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.List;

public class WildcardBridgeExercise {
    public static void main(String[] args) {
        List<?> wildCard = new ArrayList<>();
        addAndPrintTheUnknow((List<Integer>)wildCard);
    }
    public static void addAndPrintTheUnknow(List<Integer> wildList) {
        wildList.add(1);
        System.out.println(wildList.get(0));
    }
}

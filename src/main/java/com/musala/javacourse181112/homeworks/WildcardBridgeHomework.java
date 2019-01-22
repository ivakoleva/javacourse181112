package com.musala.javacourse181112.homeworks;

import java.util.ArrayList;
import java.util.List;

public class WildcardBridgeHomework {
    public static void main(final String[] args) {
        List<?> listOfUnknowns = new ArrayList<>();

        addElelemntToUnknownList((List<Object>)listOfUnknowns);


    }
    public static void addElelemntToUnknownList (List<Object> wildCardList){
        wildCardList.add(6);
        wildCardList.add("Hello");
        wildCardList.forEach(System.out::println);

    }
}

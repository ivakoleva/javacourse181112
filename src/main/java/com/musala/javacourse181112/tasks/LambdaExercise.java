package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LambdaExercise {
    public static void main(String[] args) {
        final List<Integer> myList = new ArrayList<>();

        myList.forEach(i -> myList.set(i, i+1));

        int[] intArray = {1, 2, 3, 4, 5};

        Arrays.stream(intArray).forEach(System.out::println);

//    Arrays.stream(intArray).forEach(i -> System.out.println(i));
    }



}

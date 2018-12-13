package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.stream.IntStream;

public class UtilExercise {
    public static void main(String[] args) {
       final List<Integer> integerlist=new ArrayList<>();
        IntStream.range(0, 10).forEach(integerlist::add);
        Collections.shuffle(integerlist);
        System.out.println(integerlist);
        Collections.sort(integerlist);
        System.out.println(integerlist);
        Collections.reverse(integerlist);
        System.out.println(integerlist);
        List<Integer> secondList=new ArrayList<>();
        for (int i=0;i<=100;i++){
            secondList.add(1);

        }
        System.out.println(secondList);
        final Set <Integer> set= new HashSet<>(integerlist);
        set.addAll(secondList);
        System.out.println(set);

    }
}

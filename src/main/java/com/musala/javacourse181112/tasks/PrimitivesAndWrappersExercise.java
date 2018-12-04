package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimitivesAndWrappersExercise {
    public static void main(String[] args) {
        Object[] arr = new Object[]{1,"a",(double)1.2,(byte)0101,(short)30, true,2L,0.3596f,"srk"};
        for (int i=0;i<arr.length;i++){
            System.out.println("Printing the array:" + arr[i]);
        }
        Arrays.stream(arr).filter(item->item instanceof Boolean).collect(Collectors.toList()).forEach(System.out::println);


    }
}

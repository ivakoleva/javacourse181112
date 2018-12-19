package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopExercise {
    public static void main(String[] args) {
        //usingWhile();
        //usingDoWhile();
        //usingFor();
        //usingForEach();
        usingStreamForEach();
        modifyingColection();
    }

    public static void usingStreamForEach() {

        int[] array = new int[5];
        for(int i=0;i< array.length; i++){
            array[i]= i;
        }

        Arrays.stream(array).forEach(System.out::println);
        System.out.println();
        System.out.println("\nStart to multiply");
        Arrays.stream(array).map(n -> n * n)
                .forEach(System.out::println);
        //Arrays.stream(array).forEach(i -> System.out.println(i));
    }

    private static void modifyingColection() {
        List<Integer> arrayList = new ArrayList<>();
        for(int i=0;arrayList.size() < 5; i++){
            arrayList.add(i);
        }
        final Iterator<Integer> iterator = arrayList.iterator();
        System.out.println("Array: ");
        arrayList.forEach(System.out::println);
        System.out.println("\nStart to remove");
        while (iterator.hasNext()) {
            final Integer element = iterator.next();
            if (element % 2 == 0) {
                //System.out.println("removed");
                iterator.remove();
            }
        }
        arrayList.forEach(System.out::println);
    }

    public static void usingWhile() {
        int[] array = new int[4];
        int i=0;
        while(i< array.length){
            array[i]=i;
            i++;
        }
        i=0;
        while(i< array.length){
            System.out.println(array[i]);
            i++;
        }

    }

    public static void usingDoWhile() {
        int[] array = new int[4];
        int i=0;
        do{
            array[i]=i++;
        }while(i< array.length);

        i=0;
        do{
            System.out.println(array[i++]);
        }while(i< array.length);
    }

    public static void usingFor() {
        int[] array = new int[4];
        for(int i=0;i < array.length;i++){
            array[i]=i;
        }

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void usingForEach() {
        int[] array = new int[4];
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }

        for(int i1:array) {
            System.out.println(i1);
        }
    }
}

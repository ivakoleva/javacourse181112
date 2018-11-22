package com.musala.javacourse181112.tasks;

import java.util.*;

// clean
public class LoopsExercise {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("orange");
        myList.add("banana");

        System.out.println("The list is ");
        printList(myList);
        removeElementFromList(myList);
        System.out.println("\nThe list after processing ");
        printList(myList);


        System.out.print("\nEnter length for the array: ");
        final int n = scanner.nextInt();
        final int[] array = new int[n];

        System.out.println("Using for: ");
        populateUsingFor(array);
        printArrayWithLambda(array);
        //printArray(array);

        /*System.out.println("\nUsing for each:");
        //populateUsingForeach(array);
        //printArray(array);

        System.out.println("\nUsing while:");
        //populateUsingWhile(array);
        //printArray(array);

        System.out.println("\nUsing do while:");
        populateUsingDoWhile(array);*/

        //printArray(array);
    }


    public static void populateUsingFor(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            //array[i] = i * 5;
            array[i] = i;
        }

        //printArray(array);
    }

    public static void populateUsingForeach(int[] array) {
        int index = 0;

        for (int element : array) {
            array[index] = index;
            // array[index] = index * 2;
            index++;
        }

        //printArray(array);
    }

    public static void populateUsingWhile(final int[] array) {
        int index = 0;
        while (index < array.length) {
            array[index] = index;
            // array[index] = index * index;
            index++;
        }

        //printArray(array);
    }

    public static int[] populateUsingDoWhile(final int[] array) {
        int index = 0;
        do {
            // array[index] = index * (index % 2 == 0 ? 2 : 1);
           /* if (index % 2 == 0) {
                array[index] = index * 2;
            } else {
                array[index] = index;
            }*/
            array[index] = index;
            index++;
        } while (index < array.length);

        return array;
    }

    public static void printArray(final int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void printArrayWithLambda(int [] array){

        Arrays.stream(array).forEach(i ->{
            System.out.print(i + " ");
        });

    }

    public static void removeElementFromList(List myList){

        final Iterator <String> iterator = myList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length() % 2 == 0){
                iterator.remove();
            }
        }
    }

    public static void printList(List myList){
        for (Object element : myList){
            System.out.print(element + " ");
        }

    }
}


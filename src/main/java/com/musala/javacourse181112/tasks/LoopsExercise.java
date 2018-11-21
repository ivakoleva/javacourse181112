package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsExercise {
    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length for the array: ");
        final int n = scanner.nextInt();
        final int [] array = new int[n];

        System.out.println("Using for ");
        doUsingFor(array);

        System.out.println("\nUsing for each");
        doUsingForeach(array);

        System.out.println("\nUsing while");
        doUsingWhile(array);

        System.out.println("\nUsing do while");
        doUsingDoWhile(array);
        printArray(array);
    }


    public static void doUsingFor(int [] array){

        for (int i = 0; i < array.length; i++){
            //array[i] = i * 5;
            array[i] = i;
        }

        printArray(array);
    }

    public static void doUsingForeach(int[] array){
        int index = 0;

        for (int element : array){
            array[index] = index;
          // array[index] = index * 2;
           index++;
        }

        printArray(array);
    }

    public static void doUsingWhile(int [] array){

        int index = 0;
        while (index < array.length){
            array[index] = index;
           // array[index] = index * index;
            index++;
        }

        printArray(array);
    }

    public static int[] doUsingDoWhile(int [] array) {

        int index = 0;
        do {
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

    public static void printArray(int [] array){
        for (int element : array){
            System.out.print(element + " ");
        }
    }

}


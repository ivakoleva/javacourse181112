package com.musala.javacourse181112.tasks.collections;

import java.util.*;
import java.util.stream.Stream;

public class UtilsExercise {
    /*
     *** populate an ordinal List of 10 integers
     *** shuffle list
     *** sort list
     *** reverse order
     *** populate a second List
     *** add same element 100 times to second List
     *** concatenate both lists, in order to print to stdout
     */

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> integerList = new ArrayList<>();
        final List<Integer> integerList1 = new ArrayList<>();

        System.out.print("Insert 10 integers as input for the integerList: ");

        for (int i = 0; i < 10; i++) {
            integerList.add(scanner.nextInt());
        }

        System.out.println("Integer list: " + integerList);

        Collections.shuffle(integerList);
        System.out.println("Printing shuffled list: " + integerList);

        Collections.sort(integerList);
        System.out.println("Sorted list: " + integerList);

        Collections.reverse(integerList);
        System.out.println("Reversed list: " + integerList);

        System.out.print("Add an integer: ");
        integerList1.add(scanner.nextInt());
        final Iterator iterator = integerList1.iterator();
        System.out.println("Printing 100 copies of your entry " + Collections.nCopies(100, scanner.nextInt()));


    }
}

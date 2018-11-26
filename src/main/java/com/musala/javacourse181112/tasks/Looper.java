package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Looper {
    private static int[] numbers = new int[10];
    private static int counter = 0;

    public static void main(String[] args) {
           /* automatically (using loop), initialize an array with values
print the array to stdout
 */
        forEachLoop(); // - doesn't populate the array, not sure how to do it
        forLoop();
        doWhileLoop();
        whileLoop();
        useStream();
        useCollection();
    }

    private static int[] forEachLoop() {
        for (int num : numbers) {
            numbers[counter] = counter;
            counter++;
            System.out.println(num);

        }
        return numbers;
    }

    private static int[] forLoop() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            numbers[i] = i;

        }
        return numbers;
    }

    private static int[] doWhileLoop() {
        int i = 0;
        do {
            numbers[i] = i;
            System.out.println(numbers[i]);
            i++;

        } while (i < numbers.length);
        return numbers;
    }

    private static int[] whileLoop() {
        int i = 0;
        while (i < numbers.length) {
            numbers[i] = i;
            System.out.println(numbers[i]);
            i++;
        }
        return numbers;
    }
    //todo: elaborate
    /* add lambda stream.foreach implementation
    add looping and modifying a collection of strings (using iterator)
    remve if: element length % 2 == 0

     */

    private static void useStream() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            numbers[i] = i;
        }
        //Arrays.stream(numbers).forEach(number -> System.out.println(number));
        Arrays.stream(numbers).forEach(System.out::println);
    }

    //has some issue, don't know what, doesn't get to executing this method when run
    private static void useCollection() {
        ArrayList<String> stringCollection = new ArrayList<>();
        stringCollection.add("1");
        stringCollection.add("2");
        stringCollection.add("3");
        if (stringCollection.isEmpty()) {
            System.out.println(" Your collection is empty");
        } else {
            final Iterator<String> iterator = stringCollection.iterator();

            while (iterator.hasNext()) {
                String itr = iterator.next();
                if (itr.length() % 2 == 0) {
                    iterator.remove();
                }
            }

        }
    }

}






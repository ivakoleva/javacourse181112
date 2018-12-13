package com.musala.javacourse181112.tasks.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Utils exercise
//        *** populate an ordinal List of 10 integers
//        *** shuffle list
//        *** sort list
//        *** reverse order
//        *** populate a second List
//        *** add same element 100 times to second List
//        *** concatenate both lists, in order to print to stdout
public class UtilCollectionExercise {
    public static void main(String[] args) {
        ArrayList<Integer> integerListArray = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            integerListArray.add(i);
        }
        Iterator iterator = integerListArray.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
        Collections.shuffle(integerListArray);
        integerListArray.forEach(i  -> System.out.print(i));
        System.out.println();
        Collections.sort(integerListArray);
        integerListArray.forEach(i-> System.out.print(i));
        System.out.println();
        Collections.reverse(integerListArray);
        integerListArray.forEach(i-> System.out.print(i));
        System.out.println();

        List<Integer> integerListArray1 = Collections.nCopies(100, 1);
        Stream.concat(integerListArray.stream(),integerListArray1.stream())
                .collect(Collectors.toList())
                .forEach(i -> System.out.print(i));
    }

}

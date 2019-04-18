package com.musala.javacourse181112.FirstPartJava.collections;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class LoopAndModifyCollectionExample {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        // ConcurrentModificationException expected, modifying while looping
        /*for(Integer i : integerList) {
            if(i == 2) {
                integerList.remove(i);
            }
        }*/
        final Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            final Integer element = iterator.next();
            if (element == 2) {
                iterator.remove();
            }
        }
        integerList.forEach(System.out::println);
    }
}

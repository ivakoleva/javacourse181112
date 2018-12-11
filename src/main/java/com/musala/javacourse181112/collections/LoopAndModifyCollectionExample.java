package com.musala.javacourse181112.collections;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LoopAndModifyCollectionExample {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        /*for (Integer i : integerList) {
            if (i==2) {
                integerList.remove(i);
            }
        }
        integerList.forEach(System.out::print);
        */
        final Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            final Integer element = iterator.next();
            if (element == 2) {
                iterator.remove();
            }
        }

//        for (Iterator<Integer> iterator1 = integerList.iterator(); iterator1.hasNext(); ) {
//            final Integer element = iterator1.hasNext(); )
    }
}
//}

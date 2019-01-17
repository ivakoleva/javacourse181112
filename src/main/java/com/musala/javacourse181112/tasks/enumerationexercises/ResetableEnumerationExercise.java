package com.musala.javacourse181112.tasks.enumerationexercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ResetableEnumerationExercise {
    public static void main(final String[] args) {
        final List<String> stringList = IntStream.range(1, 10)
                .boxed()
                .map(i -> "String " + i)
                .collect(Collectors.toList());
        final ResettableEnumeration<String> resettableEnumeration = enumeration(stringList);

        while (resettableEnumeration.hasMoreElements()) {
            System.out.println("Enumeration " + resettableEnumeration.nextElement());
        }
        System.out.println();
        resettableEnumeration.rest();
        final List<String> stringList1= Collections.list(resettableEnumeration);
        stringList1.forEach(System.out::println);
    }

    private static <T> ResettableEnumeration<T> enumeration(final Collection<T> c) {
        return new ResettableEnumeration<>(c);
    }

    private static class ResettableEnumeration<T> implements Enumeration<T> {
        private Collection<T> collection;
        private Iterator<T> iterator;

        ResettableEnumeration(final Collection<T> c) {
            this.collection = c;
            this.iterator = collection.iterator();
        }

        @Override
        public boolean hasMoreElements() {
            return iterator.hasNext();
        }

        @Override
        public T nextElement() {
            return iterator.next();
        }

        void rest() {

            iterator = collection.iterator();
        }
    }
}
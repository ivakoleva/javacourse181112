package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ResetableEnumerationExercise {

    public static void main(final String[] args) {
        final List<Integer> integerList = new ArrayList<>(IntStream.range(0, 5).boxed()
                .map(i -> i + 1).collect(Collectors.toList()));

        final Enumeration<Integer> integerEnumeration = enumeration(integerList);
        while (integerEnumeration.hasMoreElements()) {
            System.out.println(integerEnumeration.nextElement());
        }
    }

    private static <T> ResetableEnumeration<T> enumeration(final Collection<T> c) {
        return new ResetableEnumeration<T>() {
            private Iterator<T> i = c.iterator();

            @Override
            public boolean hasMoreElements() {
                return i.hasNext();
            }

            @Override
            public T nextElement() {
                return i.next();
            }

            @Override
            public void reset() {
                i = c.iterator();
            }
        };
    }

    private static class ResetableEnumeration<T> implements Enumeration<T> {

        @Override
        public boolean hasMoreElements() {
            return false;
        }

        @Override
        public T nextElement() {
            return null;
        }

        public void reset() {
        }
    }
}
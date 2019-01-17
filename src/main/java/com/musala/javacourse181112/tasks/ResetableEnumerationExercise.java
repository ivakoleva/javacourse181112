package com.musala.javacourse181112.tasks;

import java.util.*;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ResetableEnumerationExercise {
    public static void main(final String[] args) {
        final List<String> stringList = new ArrayList<>();
        stringList.add("blue");
        stringList.add("pink");

        final ResetableEnumeration<String> stringEnumeration = (ResetableEnumeration<String>) enumeration(stringList);
        printEnumerationToStdout(stringEnumeration);

        stringEnumeration.reset();
        printEnumerationToStdout(stringEnumeration);
    }

    private static void printEnumerationToStdout(final Enumeration<?> enumeration) {
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }


    private static <T> Enumeration<T> enumeration(final Collection<T> collection) {
        return new ResetableEnumeration<>(collection);
    }


    private static class ResetableEnumeration<T> implements Enumeration<T> {
        private final Collection<T> collection;
        private Iterator<T> iterator;

        public ResetableEnumeration(final Collection<T> collection) {
            assert collection != null;
            this.collection = collection;
            reset();
        }

        @Override
        public boolean hasMoreElements() {
            return iterator.hasNext();
        }

        @Override
        public T nextElement() {
            return iterator.next();
        }

        public void reset() {
            this.iterator = collection.iterator();
        }
    }
}
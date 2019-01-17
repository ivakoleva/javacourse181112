package com.musala.javacourse181112.tasks;

import com.sun.istack.internal.NotNull;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResetableEnumerationExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        final ResetableEnumeration<Integer> integerResetableEnumeration = enumeration(integerList);

        final List<Integer> integerList1 = new ArrayList<>();

        while (integerResetableEnumeration.hasMoreElements()) {
            integerList1.add(integerResetableEnumeration.nextElement());
        }

        integerResetableEnumeration.resetIterator();

        while (integerResetableEnumeration.hasMoreElements()) {
            System.out.println(integerResetableEnumeration.nextElement());
        }


    }


    private static <T> ResetableEnumeration<T> enumeration(final Collection<T> collection) {
        return new ResetableEnumeration<>(collection);
    }

    private static class ResetableEnumeration<T> implements Enumeration {

        private Collection<T> collection;
        private Iterator<T> iterator;

        ResetableEnumeration(@NotNull Collection<T> collection) {
            setCollection(collection);
        }

        void resetIterator() {
            iterator = collection.iterator();
        }

        @Override
        public boolean hasMoreElements() {
            return iterator.hasNext();
        }

        @Override
        public T nextElement() {
            return iterator.next();
        }

        public void setCollection(@NotNull Collection<T> collection) {
            this.collection = collection;
            resetIterator();
        }

    }
}
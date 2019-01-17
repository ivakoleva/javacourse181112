package com.musala.javacourse181112.tasks;

import com.sun.istack.internal.NotNull;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ResetableEnumerationExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        final ResetableEnumeration<Integer> integerResetableEnumeration = (ResetableEnumeration<Integer>) enumeration(integerList);

        final List<Integer> integerList1 = new ArrayList<>();

        while (integerResetableEnumeration.hasMoreElements()) {
            integerList1.add(integerResetableEnumeration.nextElement());
        }

        integerResetableEnumeration.resetIterator();

        while (integerResetableEnumeration.hasMoreElements()) {
            System.out.println(integerResetableEnumeration.nextElement());
        }


    }


    private static <T> Enumeration<T> enumeration(final Collection<T> collection) {
        return new ResetableEnumeration<T>(collection);
    }

    private static class ResetableEnumeration<T> implements Enumeration {

        private Collection<T> collection;
        private Iterator<T> iterator;

        public ResetableEnumeration(@NotNull Collection<T> collection) {
            setCollection(collection);
        }

        public void resetIterator() {
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
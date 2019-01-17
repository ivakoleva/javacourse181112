package com.musala.javacourse181112.tasks;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ResetableEnumerationExercise {

    public static void main(final String[] args) {
        final List<Integer> list = IntStream.range(1, 6).boxed().collect(Collectors.toList());
        final ResetableEnumeration<Integer> resetableEnumeration = (ResetableEnumeration<Integer>) enumeration(list);

        for (int i = 0; resetableEnumeration.hasMoreElements(); i++) {
            final Integer currentEnumeration = resetableEnumeration.nextElement();
            if (i % 2 == 0) {
                System.out.println(currentEnumeration);
            }
        }
        resetableEnumeration.reset();

        for (int i = 0; resetableEnumeration.hasMoreElements(); i++) {
            final Integer currentEnumeration = resetableEnumeration.nextElement();
            if (i % 2 != 0) {
                System.out.println(currentEnumeration);
            }
        }
        resetableEnumeration.reset();
    }

    private static <T> Enumeration<T> enumeration(final Collection<T> collection) {
        return new ResetableEnumeration<>(collection);
    }

    /**
     * Thread-safe
     *
     * @param <T>
     */
    private static class ResetableEnumeration<T> implements Enumeration<T> {
        private Collection<T> collection;
        private Iterator<T> iterator;

        private final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        public void setCollection(final Collection<T> collection) {
            reentrantReadWriteLock.writeLock().lock();
            try {
                resetCollectionAndIterator(collection);
            } finally { // important
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        public ResetableEnumeration(final Collection<T> collection) {
            resetCollectionAndIterator(collection);
        }

        public boolean hasMoreElements() {
            reentrantReadWriteLock.readLock().lock();
            try {
                return iterator.hasNext();
            } finally { // important
                reentrantReadWriteLock.readLock().unlock();
            }
        }

        public T nextElement() {
            reentrantReadWriteLock.readLock().lock();
            try {
                return iterator.next();
            } finally { // important
                reentrantReadWriteLock.readLock().unlock();
            }
        }

        public void reset() {
            reentrantReadWriteLock.writeLock().lock();
            try {
                iterator = collection.iterator();
            } finally { // important
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        private void resetCollectionAndIterator(final Collection<T> collection) {
            assert collection != null;
            this.collection = collection;
            iterator = collection.iterator();
        }
    }
}
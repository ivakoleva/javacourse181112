package com.musala.javacourse181112.tasks.libraryexercise;

import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResetableEnumerationExercise {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 6).boxed().collect(Collectors.toList());
        ResetableEnumeration<Integer> resetableEnumeration = (ResetableEnumeration<Integer>) enumeration(list);
        while (resetableEnumeration.hasMoreElements()) {
            System.out.println(resetableEnumeration.nextElement());
        }
        resetableEnumeration.reset();
    }

    private static <T> Enumeration<T> enumeration(final Collection<T> c) {
        return new ResetableEnumeration<T>(c);
    }
}


class ResetableEnumeration<T> implements Enumeration<T> {
    private Collection<T> collection;
    private Iterable<T> iterator;

    public ResetableEnumeration(Collection<T> collection) {
        this.collection = collection;
        iterator = collection.iterator();
    }

    public void setNewCollection(Collection<T> newCollection) {
        assert newCollection != null;

        this.iterator = newCollection.iterator();
        this.collection = newCollection;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }
}
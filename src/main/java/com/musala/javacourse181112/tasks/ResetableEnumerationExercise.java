package com.musala.javacourse181112.tasks;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ResetableEnumerationExercise {
    public static void main(final String[] args) {
        List<Integer> list = IntStream.range(1, 6).boxed().collect(Collectors.toList());
        ResetableEnumeration<Integer> resetableEnumeration = (ResetableEnumeration<Integer>) enumeration(list);
        for (int i = 0; resetableEnumeration.hasMoreElements(); i++) {
            Integer currentEnumeration = resetableEnumeration.nextElement();
            if (i % 2 == 0) {
                System.out.println(currentEnumeration);
            }
        }
        resetableEnumeration.reset();
        for (int i = 0; resetableEnumeration.hasMoreElements(); i++) {
            Integer currentEnumeration = resetableEnumeration.nextElement();
            if (i % 2 != 0) {
                System.out.println(currentEnumeration);
            }
        }
        resetableEnumeration.reset();
    }


    private static <T> Enumeration<T> enumeration(final Collection<T> c) {
        return new ResetableEnumeration<T>(c);
    }


}

class ResetableEnumeration<T> implements Enumeration<T> {
    private Collection<T> collection;
    private Iterator<T> iterator;

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

    public T nextElement() {
        return iterator.next();
    }

    public void reset() {
        iterator = collection.iterator();
    }

}
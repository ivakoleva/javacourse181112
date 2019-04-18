package com.musala.javacourse181112.FirstPartJava.tasks;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ResetableEnumerationExercise {
    public static void main(final String[] args) {
        // TODO: instantiate custom enumeration using private enumeration method
    }

    // TODO: fix interface surface
    private static <T> Enumeration<T> enumeration(final Collection<T> c) {
        // TODO: instantiate ResetableEnumeration
        return new Enumeration<T>() {
            private Iterator<T> i = c.iterator(); // TODO: fix encapsulation - do not duplicate code

            public boolean hasMoreElements() {
                return i.hasNext();
            }

            public T nextElement() {
                return i.next();
            }

            public void reset() {
                i = c.iterator();
            }
        };
    }

    // TODO: implements Enumeration<T>
    private static class ResetableEnumeration<T> {

    }
}
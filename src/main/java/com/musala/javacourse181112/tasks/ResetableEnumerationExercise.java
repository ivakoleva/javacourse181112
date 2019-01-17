package com.musala.javacourse181112.tasks;

import java.util.*;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ResetableEnumerationExercise {
    public static void main(final String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("blue");
        stringList.add("pink");

        ResetableEnumeration<String> stringEnumeration = (ResetableEnumeration<String>) enumeration(stringList);
        while(stringEnumeration.hasMoreElements()){
            System.out.println(stringEnumeration.nextElement());
        }

    }


    private static <T> Enumeration<T> enumeration(final Collection<T> c) {


        return new Enumeration<T>() {

            private Iterator<T> i = c.iterator();

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


    private static class ResetableEnumeration<T> implements Enumeration<T>{
        private Iterator<T> iterator;
        private Collection<T> collection;

        @Override
        public boolean hasMoreElements() {
            return iterator.hasNext();
        }

        @Override
        public T nextElement() {
            return iterator.next();
        }
    }
}
package com.musala.javacourse181112.FirstPartJava.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class CollectionsExample {
    public static void main(final String[] args) {
        final List<Integer> myList = new ArrayList<>(); // java >= 7 diamonds
        myList.add(0);
        myList.add(1);
        myList.add(2);
        //myList.add("asd");

        //System.out.println(myList.get(0));

        //final int myListSize = myList.size();

        //myList.forEach(System.out::println);

        //myList.forEach(i -> myList.remove(i));
        /*for(int i = 0; i < myList.size(); i++) {
            myList.remove(i);
        }*/

        // looping and modifying collection at the same time
        /*final Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            final Integer element = iterator.next();
            System.out.println(element);
            if (element % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(myList);*/

        // list iterator usage
        final ListIterator<Integer> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

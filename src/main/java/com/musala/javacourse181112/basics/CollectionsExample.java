package com.musala.javacourse181112.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsExample {
    public static void main(final String[] args) {
        final List<Integer> myList = new ArrayList<>();
        myList.size();
        myList.add(0);
        myList.add(1);
        myList.add(2);
//        System.out.println(myList.get(0));
//        final int myListSize = myList.size();
//        myList.forEach(System.out::println);
//        myList.forEach(i -> myList.set(i, i + 1));
//        myList.forEach(i -> myList.remove(i));
        //        myList.forEach();
//        for (int i = 0; i <myList.size() ; i++) {
//            myList.remove(i);
//        }


        final ListIterator<Integer> listIterator = myList.listIterator();
   //        looping and modifying at the same time
//        final Iterator<Integer> iterator = myList.listIterator();
//        while (iterator.hasNext()) {
//            final Integer element = iterator.next();
//            System.out.println(iterator.next());
//            if (element % 2 == 0) {
//                iterator.remove();
//            }
//
//        }
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}

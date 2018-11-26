package com.musala.javacourse181112;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loops1 {
    public static void main(final String[] args) {
        final int value[] = {1, 2, 3};
        usingWhile(value);
        usingFor(value);
        usingForeach(value);
        usingDoWhile(value);
        usingLamdaForeach();
        usingIterator();
    }

    public static void usingFor(final int[] valueArray) {
        for (int i = 0; i < valueArray.length; i++) {
            System.out.println("Printing in For: " + valueArray[i]);
        }
    }

    public static void usingDoWhile(final int[] valueArray) {
        int i = 0;
        do {
            System.out.println("Printing in Do-while: " + valueArray[i++]);
            //i++;
        } while (i < valueArray.length);
    }

    public static void usingWhile(final int[] valueArray) {
        int i = 0;
        while (i < valueArray.length) {
            System.out.println("Printing in While: " + valueArray[i++]);
            //i++;
        }
    }
    public static void usingIterator(){
        List<String>item=new ArrayList<>();
        item.add("aj");
        item.add("b");
        item.add("c");
        Iterator<String> iterator=item.iterator();
        while( iterator.hasNext()){

    public static void usingForeach(final int[] valueArray) {
        for (int limiterForeach : valueArray) {
            System.out.println("Printing in Foreach: " + limiterForeach);
        }
    }

    public static void usingLamdaForeach() {
        final List<Integer> item = new ArrayList<>();
        item.add(5);
        item.add(4);
        item.add(3);
        item.forEach(System.out::println);
    }

    public static void usingIterator() {
        final List<String> list = new ArrayList<>();
        list.add("aj");
        list.add("b");
        list.add("c");
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ((iterator.next().length() % 2 == 0)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
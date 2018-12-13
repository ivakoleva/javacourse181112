package com.musala.javacourse181112;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListAdasdasdasdasd {
    public static void main(String[] args) {
        final List<Integer> integerList = new ArrayList<>(120);
        IntStream.range(0, 100).forEach(i -> integerList.add(null));
        integerList.add(100);

        //integerList.set(100, 100);
        /*System.out.println(integerList.get(integerList.get(100)));
        System.out.println(integerList.size());

        List<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.set(100, 200);
        System.out.println(integerLinkedList.get(100));
        System.out.println(integerLinkedList.size());*/
    }
}

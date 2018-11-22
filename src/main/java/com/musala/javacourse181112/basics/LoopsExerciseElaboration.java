package com.musala.javacourse181112.basics;

import javax.xml.bind.Element;
import java.awt.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LoopsExerciseElaboration {
    public static void main(String[] args) {
        final List<String> Example = new ArrayList<>();
        Example.add("abc");
        Example.add("abcd");
        Example.add("212344");
        Example.add("3123445");
        final ListIterator<String> iteratorExample = Example.listIterator();
        while (iteratorExample.hasNext()) {
            final String element = iteratorExample.next();
            if (element.length() % 2 == 0) {
                iteratorExample.remove();
            }
        }
        System.out.println(Example);

    }
}

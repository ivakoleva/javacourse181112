package com.musala.javacourse181112.basics.task;

import com.sun.corba.se.impl.interceptors.InterceptorList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShuffleList {
    public static void main(String[] args) {
         final List <Integer> integerList1 = IntStream.range(0,10)
                 .boxed()
                 .collect(Collectors.toList());
        System.out.println( integerList1);

        Collections.shuffle(integerList1);
        System.out.println(integerList1);

        Collections.sort(integerList1);
        System.out.println(integerList1);

        Collections.reverse(integerList1);
        System.out.println(integerList1);

       final List <Integer> integerList2 = IntStream.range (0,100);
               Stream.concat(integerList1.stream(),integerList2.stream()).collect(Collectors.toList());





}}

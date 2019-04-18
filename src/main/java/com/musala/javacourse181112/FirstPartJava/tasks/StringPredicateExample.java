package com.musala.javacourse181112.FirstPartJava.tasks;

import java.util.function.Predicate;

public class StringPredicateExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("World");
        System.out.println(sb.capacity());

        Predicate<String> i  = (s)-> s.length() == 10;
        System.out.println(i.test(sb.toString()));
        sb.append("!!!");
        System.out.println(i.test(sb.toString()));
    }
}
package com.musala.javacourse181112.tasks.oop.innerexercise;

/*
Static nested class is usually used to associate a class with its outer class
*/

public class StaticNestedClass {
    private static String value = "value0";

    public static void main(String[] args) {
        printValue();
    }

    private static class NestedClass {
        private static String value = "overwritten value";
    }

    public static void printValue() {
        System.out.println("Outer class: " + value);
        System.out.println("Nested class: " + StaticNestedClass.NestedClass.value);
    }
}

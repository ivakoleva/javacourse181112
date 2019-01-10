package com.musala.javacourse181112.tasks.innerexercise;

/*
Static nested class is usually used to associate a class with its outer class
*/
public class StaticNestedClass {
    private static String value = "value0";

    public static void main(String[] args) {

    }

    private static class NestedClass {
        private static String value = "overwritten value";
    }

    public void printValue() {
        System.out.println(value);
        System.out.println(StaticNestedClass.value);
    }
}

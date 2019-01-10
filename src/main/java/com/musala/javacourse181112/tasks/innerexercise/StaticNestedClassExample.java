package com.musala.javacourse181112.tasks.innerexercise;

public class StaticNestedClassExample {
    private static String stringValue = "Hello";
    private String nonStaticValue = "Hello2";

    public static void main(final String[] args) {
        final StaticNestedClassExample staticNestedClass =
                new StaticNestedClassExample();
        NewStaticNestedClass.printValuesToStdout();
    }


    private static class NewStaticNestedClass {
        private static String newStringVAlue = "Good Night";

        public static void printValuesToStdout() {
            System.out.println(newStringVAlue);
            System.out.println(StaticNestedClassExample.stringValue);
        }
    }
}
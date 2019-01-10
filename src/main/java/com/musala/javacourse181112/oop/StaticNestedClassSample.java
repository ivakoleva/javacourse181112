package com.musala.javacourse181112.oop;

/**
 * Created by Iva Koleva on 08.01.2019
 */
// outer class
public class StaticNestedClassSample {
    private static String staticValue = "Asd";
    private String nonStaticValue = "asd"; // could be accessed by nested class only if static

    public static void main(final String[] args) {
        final StaticNestedClassSample.StaticNestedClass staticNestedClass =
                new StaticNestedClassSample.StaticNestedClass();
        staticNestedClass.printValuesToStdout();
    }

    // static nested class
    private static class StaticNestedClass {
        private static String staticValue = "Asd1";

        public void printValuesToStdout() {
            System.out.println(staticValue);
            System.out.println(StaticNestedClassSample.staticValue);
        }
    }
}

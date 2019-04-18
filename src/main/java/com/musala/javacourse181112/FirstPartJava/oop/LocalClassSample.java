package com.musala.javacourse181112.FirstPartJava.oop;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class LocalClassSample {
    public static void main(final String[] args) {
        final String value = "asd";

        // could not be static
        // could be class only
        class LocalClass {
            private String value = "asd1";

            public void printValuesToStdout() {
                System.out.println(value); // if shadowed once, could not access outer method's variables
            }
        }
        final LocalClass localClass = new LocalClass();
        localClass.printValuesToStdout();
    }
}

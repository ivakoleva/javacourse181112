package com.musala.javacourse181112.FirstPartJava.basics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class VarArgsExample {
    public static void main(final String[] args) {
        final Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("asd1");
        stringCollection.add("asd2");
        stringCollection.add("asd3");
        // allows unknown quantity of elements (up to Integer.MAX_VALUE)
        // needs a collection previously instantiated and populated
        printToStdoutCollection(stringCollection);

        // convenient one-liner, needs numerous of method overloads with varying params
        printToStdoutEnumeratedElements("asd1", "asd2");

        // would compile against 0 to Integer.MAX_VALUE
        printToStdoutVarArgs("asd1", "asd2", "asd3");
    }

    private static void printToStdoutCollection(final Collection<String> collection) {

    }

    private static void printToStdoutEnumeratedElements(final String value1, final String value2) {

    }

    private static void printToStdoutVarArgs(final String... value1) {
        assert value1 instanceof String[];
    }
}

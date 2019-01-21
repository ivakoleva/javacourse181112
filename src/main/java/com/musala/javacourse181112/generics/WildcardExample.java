package com.musala.javacourse181112.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class WildcardExample<T extends Number & Serializable> {
    private T tField;

    public static void main(final String[] args) {
        // unknown
        final List<?> listOfUnknowns = new ArrayList<>();
        listOfUnknowns.remove(0);

        final List<String> stringList = new ArrayList<>();
        System.out.println(getSizeOfCollection(stringList));


        final List<? extends Number> numberList = new ArrayList<Integer>();
    }

    private static int getSizeOfCollection(final Collection<?> collection) {
        assert collection != null;
        return collection.size();
    }

    private void test(final Class<? super Person1> unknownClass) {
        System.out.println(unknownClass.getSimpleName());
    }
}

class Entity1 {

}

class Person1 extends Entity1 {

}

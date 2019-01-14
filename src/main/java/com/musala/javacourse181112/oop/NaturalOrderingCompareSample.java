package com.musala.javacourse181112.oop;

import java.util.*;

/**
 * Created by Iva Koleva on 14.01.2019
 */
public class NaturalOrderingCompareSample {
    public static void main(final String[] args) {
        final List<CustomClass> customClassList = new ArrayList<>();
        customClassList.add(new CustomClass(10));
        customClassList.add(new CustomClass(9));
        Collections.sort(customClassList);
        System.out.println();
    }
}

class CustomClass implements Comparable<CustomClass> {
    public Integer integerField;
    public int intField;

    public CustomClass(final Integer field) {
        integerField = field;
        intField = field;
    }

    @Override
    public int compareTo(CustomClass o) {
        /*// in case of reference types
        this.integerField.compareTo(o.integerField);
        // reverse order
        o.integerField.compareTo(this.integerField);

        Objects.compare(integerField, o.integerField, Comparator.naturalOrder());*/

        // beware of primitives
        if(integerField == o.integerField) {
            return 0;
        }
        return integerField > o.integerField ? 1 : -1;
    }
}

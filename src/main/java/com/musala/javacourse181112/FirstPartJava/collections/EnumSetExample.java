package com.musala.javacourse181112.FirstPartJava.collections;

import java.util.EnumSet;

/**
 * Created by Iva Koleva on 06.12.2018
 */
public class EnumSetExample {
    public static void main(final String[] args) {
        final EnumSet<Country> ukCountryEnumSet = EnumSet.of(Country.IR, Country.GB);
        final EnumSet<Country> ukCountryEnumSet1 = EnumSet.range(Country.GB, Country.IR);
        final EnumSet<Country> allCountryEnumSet= EnumSet.allOf(Country.class);

        //Class clazz = EnumSetExample.class;
        ukCountryEnumSet.forEach(System.out::println);
    }
}

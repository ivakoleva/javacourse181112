package com.musala.javacourse181112.collections;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(final String[] args) {
        final EnumSet<Country> ukCountryEnumSet = EnumSet.of(Country.IR, Country.UK);
        final EnumSet<Country> ukCountryEnumSet1 = EnumSet.range(Country.UK, Country.IR);
        final EnumSet<Country> allCountries = EnumSet.allOf(Country.class);

//        Class clazz = EnumSetExample. - REFLECTION
    }
}

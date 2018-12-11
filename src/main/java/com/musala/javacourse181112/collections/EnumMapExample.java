package com.musala.javacourse181112.collections;

import java.util.EnumMap;

/**
 * Created by Iva Koleva on 06.12.2018
 */
public class EnumMapExample {
    public static void main(final String[] args) {
        final EnumMap<Country, String> countryLanguageMap = new EnumMap<>(Country.class);
        countryLanguageMap.put(Country.BG, "bg");

        System.out.println(countryLanguageMap.get(Country.BG));
    }
}

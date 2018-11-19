package com.musala.javacourse181112.basics;

/**
 * Created by Iva Koleva on 15.11.2018
 */
public class StringExample {
    public static void main(final String[] args) {
        String value = "asd";
        String valueUsingConstructor = new String("asd");
        System.out.println(valueUsingConstructor.equals(value));

        System.out.println(value + " asd1");
        System.out.println(value.concat(" asd1"));
    }
}

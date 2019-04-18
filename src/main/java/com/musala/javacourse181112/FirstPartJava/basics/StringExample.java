package com.musala.javacourse181112.FirstPartJava.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String value1 = "123";
        String value2 = "12asd3";
        final Pattern pattern = Pattern.compile("\\d+");

        final Matcher matcher1 = pattern.matcher(value1);
        if (matcher1.matches()) {
            System.out.println("Value1 is valid! [" + value1 + "]");
        }

        final Matcher matcher2 = pattern.matcher(value2);
        boolean print = false;
        while (matcher2.find()) {
            if(!print) {
                System.out.println("Found matches of value2:");
                print = true;
            }
            System.out.println(matcher2.group(0));
        }
    }
}

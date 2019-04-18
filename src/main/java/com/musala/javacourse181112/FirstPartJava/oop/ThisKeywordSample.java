package com.musala.javacourse181112.FirstPartJava.oop;

/**
 * Created by Iva Koleva on 03.01.2019
 */
public class ThisKeywordSample {
    private String required1;
    private String optional1;

    public ThisKeywordSample(String required1) {
        this(required1, null);
    }

    public ThisKeywordSample(final String required1,
                             final String optional1) {
        this.required1 = required1;
        this.optional1 = optional1;
    }

    // parameter shadows the class field above
    // that is why we need this in order to access instance-specific context
    public void test(String required1) {
        required1 = "asd";
        this.required1 = "asd";
        //this.test(required1);
    }
}

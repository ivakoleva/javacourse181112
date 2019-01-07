package com.musala.javacourse181112.oop;

/**
 * Created by Iva Koleva on 02.01.2019
 */
public class StaticNonStaticContextSample {

    // order of usage
    public static final String STATIC_STRING = "";
    public static final String STATIC_STRING1 = STATIC_STRING + "";

    public String nonStaticString = "";

    //void test();

    private static void staticMethod() {
        System.out.println(STATIC_STRING);
    }

}

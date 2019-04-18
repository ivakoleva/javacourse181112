package com.musala.javacourse181112.FirstPartJava.oop;

/**
 * Created by Iva Koleva on 03.01.2019
 */
public class StaticNonstaticFieldBlockConstructorOrderSample {
    // static, on class loading
    final static String name;

    static {
        name = "Asd";
    }

    static {
        System.out.println("asd");
    }

    // non-static, on each object instantiation
    {
        family = "asd0";
    }

    String family = "asd1";

    {
        family = "asd2";
        // multiple lines allowed
    }

    public StaticNonstaticFieldBlockConstructorOrderSample() {
        this.family = "asd3";
    }

    public static void main(final String[] args) {
        System.out.println();

        final StaticNonstaticFieldBlockConstructorOrderSample instance = new StaticNonstaticFieldBlockConstructorOrderSample();
    }
}

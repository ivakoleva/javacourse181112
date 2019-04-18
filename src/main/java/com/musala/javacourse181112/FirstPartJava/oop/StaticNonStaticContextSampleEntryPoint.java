package com.musala.javacourse181112.FirstPartJava.oop;

/**
 * Created by Iva Koleva on 02.01.2019
 */
public class StaticNonStaticContextSampleEntryPoint {
    public static void main(final String[] args) {
        // refer a static variable
        System.out.println(StaticNonStaticContextSample.STATIC_STRING);

        // refer a non-static variable
        final StaticNonStaticContextSample staticNonStaticContextSample = new StaticNonStaticContextSample();
        System.out.println("\"" + staticNonStaticContextSample.nonStaticString + "\"");
        staticNonStaticContextSample.nonStaticString += "asdasd";
        System.out.println("\"" + staticNonStaticContextSample.nonStaticString + "\"");

        // another instance, another memory allocation for all non-static fields
        new StaticNonStaticContextSample();


    }
}

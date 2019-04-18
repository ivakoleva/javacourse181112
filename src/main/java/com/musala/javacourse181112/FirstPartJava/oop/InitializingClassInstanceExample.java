package com.musala.javacourse181112.FirstPartJava.oop;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class InitializingClassInstanceExample {
    private String value = "asd";
    private static String valueStatic = "asd";

    {
        value = "asdf";
    }

    static {
        valueStatic = "asdf";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public InitializingClassInstanceExample() {
    }

    public InitializingClassInstanceExample(String value) {
        this.value = value;
    }

    public static void main(final String[] args) {
        new InitializingClassInstanceExample();
    }

    static class Static {

    }

    class Sdf {

    }

    // static keyword would be redundant - enum context
    static enum SampleEnum {

    }

    // annotation forces compiler to check if method is defined in superclass, and we actually override it
    @Override
    public String toString() {
        return "InitializingClassInstanceExample{" +
                "value='" + value + '\'' +
                '}';
    }

    public static void testStatic() {

    }
}

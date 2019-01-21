package com.musala.javacourse181112.reflection;

/**
 * Created by Iva Koleva on 15.01.2019
 */
public class ReflectionEntryPointSample {
    public static void main(final String[] args) throws ClassNotFoundException {
        Class<?> sampleClass;

        // static context - no instance
        sampleClass = Sample.class;

        // non-static context - using instance
        final Sample sample = new Sample();
        sampleClass = sample.getClass();

        // dynamic - by string name
        sampleClass = Class.forName("com.musala.javacourse181112.reflection.Sample");
        System.out.println();
    }
}

class Sample {

}

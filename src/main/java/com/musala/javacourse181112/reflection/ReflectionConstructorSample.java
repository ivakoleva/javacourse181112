package com.musala.javacourse181112.reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Iva Koleva on 17.01.2019
 */
public class ReflectionConstructorSample {
    public static void main(final String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //SampleClass.class.getDeclaredConstructor().newInstance()
        final SampleClass sampleClassUsingConstructor1 = SampleClass.class.newInstance();

        final SampleClass sampleClassUsingConstructor2 =
                SampleClass.class.getDeclaredConstructor(String.class).newInstance("value");

        final SampleClass sampleClassUsingConstructor3 =
                SampleClass.class.getDeclaredConstructor(String.class, Integer.class).newInstance("value", 1);
    }

    private static class SampleClass {
        private String stringValue;
        private Integer integerValue;

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(final String stringValue) {
            this.stringValue = stringValue;
        }

        public Integer getIntegerValue() {
            return integerValue;
        }

        public void setIntegerValue(final Integer integerValue) {
            this.integerValue = integerValue;
        }

        public SampleClass() {
        }

        public SampleClass(final String stringValue) {
            this.stringValue = stringValue;
        }

        public SampleClass(final String stringValue, final Integer integerValue) {
            this.stringValue = stringValue;
            this.integerValue = integerValue;
        }
    }
}

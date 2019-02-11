//package com.musala.javacourse181112.tasks;
//
//import java.lang.reflect.InvocationTargetException;
//
//public class Reflection {
//    public static void main(final String[] args) throws
//            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        final SampleClass constructor1 = SampleClass.class.newInstance();
//
//        final SampleClass constructor2 =
//                SampleClass.class.getDeclaredConstructor(String.class).newInstance("value");
//
//        final SampleClass constructor3 =
//                SampleClass.class.getDeclaredConstructor(String.class, Integer.class).newInstance("value", 1);
//    }
//
//    private static class SampleClass {
//        private String stringValue;
//        private Integer integerValue;
//
//        public String getStringValue {
//            return stringValue;
//        }
//
//        public void setStringValue(final String stringValue) {
//            this.stringValue = stringValue;
//        }
//
//        public Integer getIntegerValue {
//            return integerValue;
//        }
//
//        public void setIntegerValue(final Integer integerValue) {
//            this.integerValue = integerValue;
//        }
//
//        public SampleClass() {
//
//        }
//
//        public SampleClass(final String stringValue) {
//            this.stringValue = stringValue;
//        }
//
//        public SampleClass(final String stringValue, final Integer integerValue) {
//            this.stringValue = stringValue;
//            this.integerValue = integerValue;
//        }
//    }
//}
//
//
////GetDeclaredConstrictor
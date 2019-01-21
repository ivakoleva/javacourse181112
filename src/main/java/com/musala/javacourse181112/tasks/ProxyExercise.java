package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExercise {
    public static void main(String[] args) {
        final SampleInterface sampleInterface;
        sampleInterface = (SampleInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{SampleInterface.class},
                new SampleInvocationHandler<>(new SampleClass()));
        sampleInterface.setStringValue("asd");
        sampleInterface.setIntegerValue(1);
        sampleInterface.setStringValue1("AsdswQw");
        System.out.println(sampleInterface.getStringValue()
                + " " + sampleInterface.getIntegerValue()
                + " " + sampleInterface.getStringValue1());

    }

    private static class SampleInvocationHandler<T> implements InvocationHandler {
        T object;

        public SampleInvocationHandler(T object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("set".equals(method.getName().substring(0, 3))) {
                if (args[0].getClass().equals(String.class)) {
                    args[0] = args[0].toString().toUpperCase();
                }
            }
            return method.invoke(object, args);
        }
    }

    private interface SampleInterface {
        String getStringValue();

        void setStringValue(String stringValue);

        String getStringValue1();

        void setStringValue1(String stringValue);

        Integer getIntegerValue();

        void setIntegerValue(Integer integerValue);
    }

    private static class SampleClass implements SampleInterface {
        private String stringValue;
        private String stringValue1;
        private Integer integerValue;

        @Override
        public String getStringValue() {
            return stringValue;
        }

        @Override
        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public Integer getIntegerValue() {
            return integerValue;
        }

        @Override
        public void setIntegerValue(Integer integerValue) {
            this.integerValue = integerValue;
        }

        @Override
        public String getStringValue1() {
            return stringValue1;
        }

        public void setStringValue1(String stringValue1) {
            this.stringValue1 = stringValue1;
        }
    }
}

package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExercise {
    public static void main(final String[] args) {
        final ExampleInterface exampleInterface = (ExampleInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{
                        ExampleInterface.class
                },
                new SampleInvocationHandler(new ExampleClass())
        );

        exampleInterface.setStringValue("hello");
        System.out.println(exampleInterface.getStringValue());
    }

    private static class SampleInvocationHandler implements InvocationHandler {
        private Object instance;

        public SampleInvocationHandler(final Object instance) {
            this.instance = instance;
        }

        @Override
        public Object invoke(final Object proxy,
                             final Method method,
                             final Object[] args) throws Throwable {
            if (method.getName().contains("set") && args[0].getClass().equals(String.class)) {
                args[0] = args[0].toString().toUpperCase();
            }
            return method.invoke(instance, args);
        }
    }

    private interface ExampleInterface {
        String getStringValue();

        void setStringValue(String stringValue);
    }

    private static class ExampleClass implements ExampleInterface {
        private String stringValue;

        @Override
        public String getStringValue() {
            return stringValue;
        }

        @Override
        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }
    }
}

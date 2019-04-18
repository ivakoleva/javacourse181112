package com.musala.javacourse181112.FirstPartJava.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Iva Koleva on 21.01.2019
 */
public class ProxySample {
    public static void main(final String[] args) {
        final SampleStringPropertyInterface sampleStringInstance = (SampleStringPropertyInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{
                        SampleIntegerPropertyInterface.class,
                        SampleStringPropertyInterface.class
                },
                new SampleInvocationHandler(new SampleClass())
        );

        sampleStringInstance.setStringValue("asd");
        System.out.println();

        final SampleIntegerPropertyInterface sampleIntegerInstance = (SampleIntegerPropertyInterface) sampleStringInstance;
        sampleIntegerInstance.setIntValue(1);
        System.out.println();
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
            System.out.println("Method " + method.getName() +
                    " with args [" + Arrays.stream(args).map(Object::toString).collect(Collectors.joining(", ")) +
                    "] intercepted.");
            //throw new Exception("no recursion here.");
            return method.invoke(instance, args);
        }
    }

    private interface SampleIntegerPropertyInterface {
        int getIntValue();

        void setIntValue(int intValue);
    }

    private interface SampleStringPropertyInterface {
        String getStringValue();

        void setStringValue(String stringValue);
    }


    private static class SampleClass implements SampleIntegerPropertyInterface, SampleStringPropertyInterface {
        private int intValue;
        private String stringValue;

        @Override
        public int getIntValue() {
            return intValue;
        }

        @Override
        public void setIntValue(int intValue) {
            this.intValue = intValue;
        }

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

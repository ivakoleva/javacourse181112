package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyExercise {
    public static void main(String[] args) {
        final SampleInterface sampleInterface;
        sampleInterface = (SampleInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{SampleInterface.class},
                new SampleInvocationHandler<>(new SampleClass()));
        sampleInterface.setStringValue("123");
        System.out.println(sampleInterface.getStringValue());
    }

    private static class SampleInvocationHandler<T> implements InvocationHandler {
        T object;

        public SampleInvocationHandler(T object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("set".equals(method.getName().substring(0, 3))) {
                Arrays.stream(args).forEach(arg -> {
                    if (String.class.equals(arg.getClass())) {
                        String s = (String) arg;
                        arg = s.toUpperCase();
                    }
                });
            }
            return method.invoke(object, args);
        }
    }

    private interface SampleInterface {
        String getStringValue();

        void setStringValue(String stringValue);
    }

    private static class SampleClass implements SampleInterface {
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

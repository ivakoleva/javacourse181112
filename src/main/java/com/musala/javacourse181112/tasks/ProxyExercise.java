package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyExercise {
    /*
     *** intercept all setters of String values
     *** then modify the value to upper-case
     *** set the modified value
     *** print instance fields to stdout
     * */
    public static void main(final String[] args) {
        final StingInterface stringInstance = (StingInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{
                        StingInterface.class
                },
                new SampleInvocationHandler(new StringClass())
        );

        stringInstance.setStringValue("test");
        System.out.println(stringInstance.getStringValue());
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
            if ((method.getName().startsWith("set")) &&
                    (method.getParameterTypes().length == 1 &&
                            String.class.equals(method.getParameterTypes()[0])) &&
                    (args[0] != null)) {
                args[0] = ((String) args[0]).toUpperCase();
            }
            return method.invoke(instance, args);
        }
    }


    private interface StingInterface {
        String getStringValue();

        void setStringValue(String stringValue);
    }

    private static class StringClass implements StingInterface {
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

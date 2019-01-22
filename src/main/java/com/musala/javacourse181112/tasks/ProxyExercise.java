package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyExercise {
    public static void main(String[] args) {
        final StringPropertyInterface stringInstance = (StringPropertyInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{
                        StringPropertyInterface.class
                },
                new OneInvocationHandler(new OneClass())
        );
        stringInstance.setStringValue("asd");
        System.out.println(stringInstance.getStringValue());

    }

    private static class OneInvocationHandler<T> implements InvocationHandler {
        final private T instance;

        public OneInvocationHandler(final T instance) {
            this.instance = instance;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().startsWith("set") && method.getParameterTypes()[0].equals(String.class)) {
                args[0] = args[0].toString().toUpperCase();
            }
            return method.invoke(instance, args);
        }
    }

    private interface StringPropertyInterface {
        String getStringValue();

        void setStringValue(String stringValue);
    }

    private static class OneClass implements StringPropertyInterface {
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

package com.musala.javacourse181112.tasks;

import java.lang.reflect.Proxy;

public class ProxyExercise {
    public static void main(final String[] args) {
        final StringPropertyInterface stringPropertyInterface = (StringPropertyInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[] {StringPropertyInterface.class},
                (proxy, method, methodArgs) -> {
                    if("setStringValue".equals(method.getName())){
                        System.out.println("Method " + method.getName() +
                                " intercepted. " +
                                method.getName().toUpperCase());
                        return 42;
                    }else{
                        throw new UnsupportedOperationException(
                                "Unsupported method: " + method.getName());
                    }
                });

        stringPropertyInterface.setStringValue("hello");

    }
}

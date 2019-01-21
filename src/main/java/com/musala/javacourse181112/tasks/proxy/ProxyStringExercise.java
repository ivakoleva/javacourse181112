package com.musala.javacourse181112.tasks.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyStringExercise {
        public static void main(final String[] args) {
            final SampleStringPropertyInterface sampleStringInstance = (SampleStringPropertyInterface) Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[]{
                            //SampleIntegerPropertyInterface.class,
                            SampleStringPropertyInterface.class
                    },
                    new SampleInvocationHandler(new SampleClass())
            );

            sampleStringInstance.setStringValue("asd");
            System.out.println(sampleStringInstance.getStringValue());

        }

        private static class SampleInvocationHandler implements InvocationHandler {
            private final Object instance;

            public SampleInvocationHandler(final Object instance) {
                this.instance = instance;
            }

            @Override
            public Object invoke(final Object proxy,
                                 final Method method,
                                 final Object[] args) throws Throwable {

                // intercept all setters of String values
                if (!isStringSetter(method, args)){
                    return method.invoke(instance, args);
                }
                 args[0] = args[0].toString().toUpperCase();

                return method.invoke(instance, args);
            }

            private boolean isStringSetter(final Method method, final Object[] args) {
                return  "set".equals(method.getName().substring(0, 3))
                        && args[0].getClass().equals(String.class)
                        && method.getReturnType().equals(Void.TYPE)
                        && args.length == 1;
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

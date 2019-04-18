package com.musala.javacourse181112.FirstPartJava.reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Iva Koleva on 17.01.2019
 */
public class ReflectionGenericConstructorsSample {
    public static void main(final String[] args) {
        final List<SampleClass> sampleClassList = newInstancePopulated(SampleClass.class);
        System.out.println();
    }

    public static <T> List<T> newInstancePopulated(final Class<T> tClass) {
        assert tClass != null;
        final List<Class<?>> supportedParameterTypes = Arrays.asList(String.class, Integer.class);

        return Arrays.stream(tClass.getDeclaredConstructors())
                .filter(constructor ->
                        constructor.getParameterCount() == 0 ||
                                Arrays.stream(constructor.getParameterTypes())
                                        .allMatch(supportedParameterTypes::contains)) // TODO: isAssignableFrom
                .map(constructor -> {
                    final List<?> parameters = Arrays.stream(constructor.getParameterTypes())
                            .map(parameterClass -> {
                                if (String.class.equals(parameterClass)) {
                                    return "";
                                } else if (Integer.class.equals(parameterClass)) {
                                    return 0;
                                }
                                // TODO: eventually return null ?
                                throw new UnsupportedOperationException("unsupported parameter type.");
                            })
                            // TODO: could we have valid null parameter values ?
                            //.filter(Objects::nonNull) // because of lambda
                            .collect(Collectors.toList());
                    try {
                        return (T) constructor.newInstance(parameters.toArray());
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return null; // could be better if old-school loops used instead of lambda, in combination with reflection
                })
                .filter(Objects::nonNull) // because of lambda
                .collect(Collectors.toList());
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

package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 ** Reflection generic instantiation
 *** Constructors
 **** create a sample class, with a few overloaded constructors
 **** instantiate that class, by each of the overloaded constructors, using reflection

 *** Setters
 **** implement initial data bootstrap evaluating all setters, supporting at least 3 data types
 */
public class ReflectionExercise {
    private static class Sample {
        private Integer integer;
        private String string;

        public Sample() {
            this(-1, "no_string");
        }

        public Sample(Integer integer) {
            this(integer, "no_string");
        }

        public Sample(String string) {
            this(-1, string);
        }

        public Sample(Integer integer, String string) {
            this.integer = integer;
            this.string = string;
        }

        public String toString() {
            return string + " " + integer;
        }

        public void setInteger(Integer integer) {
            this.integer = integer;
        }

        public void setString(String string) {
            this.string = string;
        }
    }

    public static void main(String[] args) {
        /*try {
            System.out.println(Sample.class.getConstructor(Integer.class, String.class).newInstance(5, "afa"));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Sample.class.getConstructor(Integer.class).newInstance(5));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Sample.class.getConstructor(String.class).newInstance("afa"));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }*/

        Arrays.stream(Sample.class.getDeclaredConstructors())
                .map(constructor -> {
                    final int parameterLength = constructor.getParameterTypes().length;

                    Sample sample = null;
                    try {
                        switch (parameterLength) {
                            case 1:
                                if (Integer.class.equals(constructor.getParameterTypes()[0])) { // TODO: isAssignableFrom
                                    sample = (Sample) constructor.newInstance(4);
                                } else if (String.class.equals(constructor.getParameterTypes()[0])) {
                                    sample = (Sample) constructor.newInstance("only_string");
                                }
                                break;
                            case 2:
                                sample = (Sample) constructor.newInstance(5, "string_&_int");
                                break;
                            default:
                                sample = (Sample) constructor.newInstance();
                        }
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return sample;
                })
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        final Sample sample = new Sample(3, "asd");
        Arrays.stream(sample.getClass().getDeclaredMethods())
                .filter(method -> isSetterPredicate.test(method.getName()))
                .forEach(method -> {
                    try {
                        method.invoke(sample, getInstanceOf(method.getParameterTypes()[0]));
                    } catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                });

        System.out.println(System.lineSeparator() + "With setters" + System.lineSeparator() + sample);
    }

    private static final Predicate<String> isSetterPredicate = name -> name.contains("set");

    private static <T> T getInstanceOf(Class<T> clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (Arrays.stream(clazz.getDeclaredConstructors()).map(i -> i.getParameterTypes().length).collect(Collectors.toList()).contains(0)) {
            return clazz.getConstructor().newInstance();
        } else {
            return clazz.getConstructor(String.class).newInstance("2");
        }

    }
}

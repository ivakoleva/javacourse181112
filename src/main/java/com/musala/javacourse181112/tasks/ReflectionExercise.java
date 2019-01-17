package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Objects;

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
        Integer integer;
        String string;

        public Sample() {
            this(-1, "bez_string");
        }

        public Sample(Integer integer) {
            this(integer, "bez_string");
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
                .map(i -> {
                    int parameterLength = i.getParameterTypes().length;
                    Sample sample = null;
                    if (parameterLength == 2) {
                        try {
                            sample = (Sample) i.newInstance(5, "string_i_int");
                        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    } else if (parameterLength == 1) {
                        if (i.getParameterTypes()[0].equals(Integer.class)) {
                            try {
                                sample = (Sample) i.newInstance(4);
                            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        } else if (i.getParameterTypes()[0].equals(String.class)) {
                            try {
                                sample = (Sample) i.newInstance("samo_string");
                            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        try {
                            sample = (Sample) i.newInstance();
                        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                    return sample;
                })
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}

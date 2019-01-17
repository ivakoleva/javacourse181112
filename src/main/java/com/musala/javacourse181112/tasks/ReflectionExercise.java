package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Objects;
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
        Integer integer;
        String string;

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
                .map(i -> {
                    int parameterLength = i.getParameterTypes().length;
                    Sample sample = null;
                    if (parameterLength == 2) {
                        try {
                            sample = (Sample) i.newInstance(5, "string_&_int");
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
                                sample = (Sample) i.newInstance("only_string");
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
        Sample sample = new Sample(3, "asd");
        Arrays.stream(sample.getClass().getDeclaredMethods()).filter(i -> isSetter(i.getName())).forEach(i -> {
            try {
                i.invoke(sample, getInstanceOf(i.getParameterTypes()[0]));
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        });

        System.out.println(System.lineSeparator() + "With setters" + System.lineSeparator() + sample);
    }

    private static boolean isSetter(String name) {
        return name.contains("set");
    }

    private static <T> T getInstanceOf(Class<T> clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (Arrays.stream(clazz.getDeclaredConstructors()).map(i -> i.getParameterTypes().length).collect(Collectors.toList()).contains(0)) {
            return clazz.getConstructor().newInstance();
        } else {
            return clazz.getConstructor(String.class).newInstance("2");
        }

    }
}

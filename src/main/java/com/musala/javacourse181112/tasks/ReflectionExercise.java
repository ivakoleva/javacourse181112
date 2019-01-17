package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;

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
            this(0, "");
        }

        public Sample(Integer integer) {
            this(integer, "");
        }

        public Sample(String string) {
            this(0, string);
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
        try {
            Sample.class.getConstructor(Integer.class, String.class).newInstance(5, "afa");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            Sample.class.getConstructor(Integer.class).newInstance(5);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            Sample.class.getConstructor(String.class).newInstance("afa");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //Arrays.stream(Sample.class.getDeclaredConstructors()).forEach(i->getNeededParameters(i.getParameterTypes()));
    }
}

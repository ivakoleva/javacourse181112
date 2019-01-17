package com.musala.javacourse181112.tasks.SampleClass;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(final String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        final Constructor<Sample> constructor = Sample.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        final Sample constructor1 = constructor.newInstance();

        final Sample constructor2 = Sample.class.getDeclaredConstructor(int.class).newInstance(1);

        final Sample constructor3 = Sample.class
                .getDeclaredConstructor(int.class, String.class).newInstance(1, "Asd");
    }
}

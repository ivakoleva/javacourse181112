package com.musala.javacourse181112.tasks.SampleClass;


import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(final String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        final Sample constructor1 = Sample.class.newInstance();

        final Sample constructor2 = Sample.class.getDeclaredConstructor(Integer.class).newInstance(1);

        final Sample constructor3 = Sample.class
                .getDeclaredConstructor(Integer.class, String.class).newInstance(1,"Asd");








    }
}

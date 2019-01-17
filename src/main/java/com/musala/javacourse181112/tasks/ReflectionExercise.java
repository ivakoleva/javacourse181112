package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;

public class ReflectionExercise {

    public static void main(String[] args) {
        try {
            Sample.class.getConstructor(int.class,String.class).newInstance(5,"Hello");
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            Sample.class.getConstructor(int.class).newInstance(5);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static class Sample{
        private int anInt;
        private String anString;

        public Sample(int anInt, String anString) {
            this.anInt = anInt;
            this.anString = anString;
        }

        public Sample(int anInt) {
            this.anInt = anInt;
        }
    }
}

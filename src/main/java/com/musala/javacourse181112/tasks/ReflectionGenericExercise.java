package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;

public class ReflectionGenericExercise {
    public static void main(String[] args) {
        try {
            Sample.class.getConstructor(int.class, String.class).newInstance(123, "asd");
        } catch (InstantiationException | IllegalAccessException |
                NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Sample.class.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException |
                NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Sample.class.getConstructor(int.class).newInstance(321);
        } catch (InstantiationException | IllegalAccessException |
                NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Sample.class.getConstructor(String.class).newInstance("abc");
        } catch (InstantiationException | IllegalAccessException |
                NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static class Sample {
        private int anInt;
        private String anString;

        public Sample() {

        }

        public Sample(String anString) {
            this.anString = anString;
        }

        public Sample(int anInt) {
            this.anInt = anInt;
        }

        public Sample(int anInt, String anString) {
            this.anInt = anInt;
            this.anString = anString;
        }

        public int getAnInt() {
            return anInt;
        }

        public void setAnInt(int anInt) {
            this.anInt = anInt;
        }

        public String getAnString() {
            return anString;
        }

        public void setAnString(String anString) {
            this.anString = anString;
        }
    }

}

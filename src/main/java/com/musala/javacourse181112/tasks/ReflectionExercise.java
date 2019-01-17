package com.musala.javacourse181112.tasks;

import java.lang.reflect.InvocationTargetException;

public class ReflectionExercise {
    private String text;
    private int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ReflectionExercise (){

    }

    public ReflectionExercise(final String text){
        this.text = text;
    }

    public ReflectionExercise(final String text,final int number){
        this.text = text;
        this.number = number;
    }
}

class Main {
    public static void main(final String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
       final ReflectionExercise reflectionExercise = ReflectionExercise.class.newInstance();

        final ReflectionExercise reflectionExercise2 = ReflectionExercise.class.getDeclaredConstructor(String.class).newInstance("Text");

        final ReflectionExercise reflectionExercise3 = ReflectionExercise.class.getDeclaredConstructor(String.class, int.class).newInstance("Text",10);

    }
}
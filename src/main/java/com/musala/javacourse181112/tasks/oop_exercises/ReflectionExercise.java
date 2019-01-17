package com.musala.javacourse181112.tasks.oop_exercises;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ReflectionExercise {
    private String aString;
    private Integer anInteger;
    private Double aDouble;

    public ReflectionExercise(){}

    public ReflectionExercise(String aString){
        this.aString = aString;
    }

    public ReflectionExercise(String aString, Integer anInteger){
        this.aString = aString;
        this.anInteger = anInteger;
    }

    public ReflectionExercise(String aString, Integer anInteger, Double aDouble){
        this.aString = aString;
        this.anInteger = anInteger;
        this.aDouble = aDouble;
    }

    public static void main(String[] args) {
        //ReflectionExercise reflectionExercise = new ReflectionExercise();
       // Constructor[] constructors1 = ReflectionExercise.class.getConstructors();
        try {
            Constructor<ReflectionExercise> constructor = ReflectionExercise.class.getConstructor();
            Constructor<ReflectionExercise> constructor1 = ReflectionExercise.class.getDeclaredConstructor(String.class);
            Constructor<ReflectionExercise> constructor2 = ReflectionExercise.class.getDeclaredConstructor(String.class, Integer.class);
            Constructor<ReflectionExercise> constructor3 = ReflectionExercise.class.getDeclaredConstructor(String.class, Integer.class, Double.class);
            final ReflectionExercise reflectionExercise = constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }



    }
}

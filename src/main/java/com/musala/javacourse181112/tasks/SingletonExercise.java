package com.musala.javacourse181112.tasks;

public class SingletonExercise {
    private static SingletonExercise instance;

    private SingletonExercise(){}

    public static SingletonExercise getInstance(){
        if (instance == null){
            instance = new SingletonExercise();
        }
        return instance;
    }
}

package com.musala.javacourse181112.tasks;

public class SingletonExercise {

}

class SingletonApplication {
    private static SingletonApplication instance;

    private SingletonApplication() {
    }

    public static SingletonApplication getInstance() {
        if (instance != null) {
            return instance;
        }
        return instance = new SingletonApplication();
    }
}
package com.musala.javacourse181112.tasks;

public class SingletonExercise {
    public static void main(final String[] args) {
        final SingletonApplicationClass singletonApplication = SingletonApplicationClass.getInstance();
        final SingletonApplicationClass singletonApplication1 = SingletonApplicationClass.getInstance();
        assert singletonApplication == singletonApplication1;
    }
}

class SingletonApplicationClass {
    private static final SingletonApplicationClass INSTANCE = new SingletonApplicationClass();

    private SingletonApplicationClass() {
    }

    public static SingletonApplicationClass getInstance() {
        return INSTANCE;
    }
}


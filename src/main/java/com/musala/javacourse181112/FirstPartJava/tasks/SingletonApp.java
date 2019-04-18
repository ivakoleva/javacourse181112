package com.musala.javacourse181112.FirstPartJava.tasks;

public class SingletonApp {

    private static SingletonApp INSTANCE;

    private SingletonApp() {}

    public static SingletonApp getInstance(){
        if (INSTANCE != null){
            return INSTANCE;
        } return INSTANCE = new SingletonApp();
    }
}

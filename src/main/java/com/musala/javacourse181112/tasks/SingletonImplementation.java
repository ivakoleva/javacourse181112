package com.musala.javacourse181112.tasks;

import javafx.application.Application;
import javafx.stage.Stage;

public class SingletonImplementation extends Application {
    private static SingletonImplementation instance;

    private SingletonImplementation() {
    }

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.show();
    }

    public static void main(final String[] args) {
        final SingletonImplementation singletonImplementation = SingletonImplementation.getInstance();
        final SingletonImplementation singletonImplementation1 = SingletonImplementation.getInstance();
        assert singletonImplementation == singletonImplementation1;
    }

    private static synchronized SingletonImplementation getInstance() {
        if (instance == null) {
            instance = new SingletonImplementation();
        }
        return instance;
    }
}

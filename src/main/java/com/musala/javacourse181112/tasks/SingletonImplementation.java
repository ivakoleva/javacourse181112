package com.musala.javacourse181112.tasks;

import javafx.application.Application;
import javafx.stage.Stage;

public class SingletonImplementation extends Application {
    public static void main(String[] args) {
        final SingletonImplementation singletonImplementation = SingletonImplementation.getInstance();
        final SingletonImplementation singletonImplementation1 = SingletonImplementation.getInstance();
        assert singletonImplementation == singletonImplementation1;


    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
    }
    private static SingletonImplementation INSTANCE;

    private SingletonImplementation() {
    }

    private static synchronized SingletonImplementation getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonImplementation();
        }
        return INSTANCE;
    }

}

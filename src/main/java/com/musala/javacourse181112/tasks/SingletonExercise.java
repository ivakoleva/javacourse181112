package com.musala.javacourse181112.tasks;

import javafx.application.Application;
import javafx.stage.Stage;

public class SingletonExercise {

}
class SingletonApplication{
    private static SingletonApplication app=null;
    private SingletonApplication(){

    }
    public static SingletonApplication getInstance(){
        if(app!=null){
            return app;
        }
        return new SingletonApplication();
    }
}
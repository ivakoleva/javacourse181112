package com.musala.javacourse181112.homeworks;


public class SingletonImplementationHomework {

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

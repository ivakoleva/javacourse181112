package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

class Singleton
{

    private static Singleton single_instance = null;


    public String s;


    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }


    public static Singleton getInstance() {


      return (null == single_instance) ? (single_instance = new Singleton()) : single_instance;
    }
}
package com.musala.javacourse181112.tasks.FutureAgeCalcApp;

public class Person {
    private String firstName;
    private String familyName;
    private int age;

    public Person(String Name, int age){
        setName(Name);
        this.age=age;

    }
    public String getName(){
        return firstName+ " " + familyName;
    }

    public int getAge(){
        return age;

    }

    public void setName(String name){
        int i= name.indexOf(" ");
        firstName = name.substring(0,i);
        familyName = name.substring(i + 1);
    }
}

package com.musala.javacourse181112.tasks.FutureAgeCalcApp;

public class AgeCalculator {
    private Person person;
    private int yearsToadd;

    public  AgeCalculator(Person person, int addAge){
        this.person = person;
        this.yearsToadd = addAge;
    }
    public int getFutureAge(){
        return person.getAge() + yearsToadd;


    }
}

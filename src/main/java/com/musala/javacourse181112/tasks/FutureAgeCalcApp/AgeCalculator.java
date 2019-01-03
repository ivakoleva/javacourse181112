package com.musala.javacourse181112.tasks.FutureAgeCalcApp;

import java.util.Calendar;

public class AgeCalculator {
    private Person person;
    private int yearsToadd;

    public  AgeCalculator(Person person, int addAge){
        this.person = person;
        this.yearsToadd = addAge;
    }

    public AgeCalculator(){

    }
    public int getFutureAge(){
        return person.getAge() + yearsToadd;


    }

    public void setPerson(Person person){
        this.person = person;
    }

    public void setYearsToadd(int yearsToadd){
        this.yearsToadd = yearsToadd;
    }
}

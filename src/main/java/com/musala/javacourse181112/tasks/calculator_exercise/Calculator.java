package com.musala.javacourse181112.tasks.calculator_exercise;

public class Calculator {
    private Person person;
    private int yearsToAdd;

    public Calculator(Person person, int addAge) {
        this.person = person;
        this.yearsToAdd = addAge;
    }

    public Calculator() {
    }

    public int getFutureAge() {
        return person.getAge() + yearsToAdd;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setYearsToAdd(int yearsToAdd) {
        this.yearsToAdd = yearsToAdd;
    }

}

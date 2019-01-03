package com.musala.javacourse181112.tasks.calculatorexersice;

public class Calculator {
    private Person person;
    private int yearsToAdd;

    public Calculator(Person person, int addToAge) {
        this.person = person;
        this.yearsToAdd = addToAge;
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


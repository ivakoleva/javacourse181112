package com.musala.javacourse181112.tasks.calculatorexercise;

public class Calculator {
    private Person person;
    private int yearsToAdd;

    public Calculator() {
    }

    public int getFutureAge() {
        return person.getAge() + yearsToAdd;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void yearsToAdd(int yearsToAdd) {
        this.yearsToAdd = yearsToAdd;
    }

}

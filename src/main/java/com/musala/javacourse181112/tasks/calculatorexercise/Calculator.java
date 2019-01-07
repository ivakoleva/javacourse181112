package com.musala.javacourse181112.tasks.calculatorexercise;

/*Future age calculator application v0.2
        ** create tasks.calculatorexercise sub-package
        ** Calculator class implementation
        ** Calculator accepts parameters of:
            ** Person objects (age field)
            ** years to add to age of each person
        ** Program flow:
            ** When starting the program, populate 10 Person objects
            ** Instantiate Calculator
            ** Execute additions, and print to standard output
            ** Then exit
        ** Distribute to end user (push to github*/
public class Calculator {
    private Person person;
    private int addedYears;
    //private int futureAge;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getAddedYears() {
        return addedYears;
    }

    public void setAddedYears(int addedYears) {
        this.addedYears = addedYears;
    }

    public int futureAge(){
        return person.getAge() + addedYears;
    }

    @Override
    public String toString() {
        return person.getName()+"futureAge"+ getAddedYears();
    }
}

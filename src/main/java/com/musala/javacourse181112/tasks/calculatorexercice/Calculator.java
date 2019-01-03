package com.musala.javacourse181112.tasks.calculatorexercice;

public class Calculator {
  private Person person;
  private int ageToAdd;


    public Person getPerson() {
        return person;
    }

    void setPerson(Person person) {
        this.person = person;
    }


    int getFutureAge() {
        return ageToAdd+person.getAge();
    }

    void setAgeToAdd(int ageToAdd) {
        this.ageToAdd = ageToAdd;
    }

    @Override
    public String toString() {
        return person.getName()+" FutureAge:"+getFutureAge();
    }
}

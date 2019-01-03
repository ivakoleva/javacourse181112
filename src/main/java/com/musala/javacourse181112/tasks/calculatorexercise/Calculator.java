package com.musala.javacourse181112.tasks.calculatorexercise;

import java.util.ArrayList;
import java.util.List;

public class Calculator{
    private int futureYears;

    public int getFutureYears() {
        return futureYears;
    }

    public void setFutureYears(int futureYears) {
        this.futureYears = futureYears;
    }

    public int calculateYears(Person person){
        futureYears = person.getAge() + person.getAgeToAdd();
        return futureYears;
    }

}

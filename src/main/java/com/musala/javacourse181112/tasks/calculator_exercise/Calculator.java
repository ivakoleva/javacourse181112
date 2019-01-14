package com.musala.javacourse181112.tasks.calculator_exercise;

public class Calculator<T extends Calculatable> {
    private T calculatable;
    private int yearsToAdd;

    public Calculator(T calculatable, int addAge) {
        this.calculatable = calculatable;
        this.yearsToAdd = addAge;
    }

    public Calculator() {
    }

    public int getFutureAge() {
        return calculatable.getAge() + yearsToAdd;
    }

    public void setPerson(T calculatable) {
        this.calculatable = calculatable;
    }

    public void setYearsToAdd(int yearsToAdd) {
        this.yearsToAdd = yearsToAdd;
    }

}

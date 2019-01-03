package com.musala.javacourse181112.tasks.FutureAgeCalcApp;



public class AgeCalculator<T extends Calculatable> {
    private T calculatable;
    private int yearsToAdd;

    public AgeCalculator(T calculatable, int addAge) {
        this.calculatable = calculatable;
        this.yearsToAdd = addAge;
    }

    public AgeCalculator() {
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
package com.musala.javacourse181112.tasks.calculator_exercise;

import com.musala.javacourse181112.tasks.methods_exercises.Person;

import java.lang.reflect.Type;

public class Calculator<T extends Calculatable> {
    private T calculatable;
    private int yearsToAdd;

    public Calculator(T calculatable, int addYearsToAdd){
        this.calculatable = calculatable;
        this.yearsToAdd = addYearsToAdd;
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

package com.musala.javacourse181112.oop.calculatorexercise;

import java.time.LocalDate;

/**
 * Created by Iva Koleva on 03.01.2019
 */
public class Person implements Calculatable {
    private LocalDate dateOfBirth;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int getValue() {
        return Utils.calculateYearsFrom(dateOfBirth);
    }
}

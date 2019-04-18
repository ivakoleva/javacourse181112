package com.musala.javacourse181112.FirstPartJava.oop.votesexercise.model;

import java.time.LocalDate;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Person {
    private String name;
    private String family;
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

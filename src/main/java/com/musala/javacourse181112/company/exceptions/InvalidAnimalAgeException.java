package com.musala.javacourse181112.company.exceptions;

public class InvalidAnimalAgeException extends IllegalArgumentException {

    private static final String DEFFAULT_MESSAGE = "Animal age cannot be less than 0.";

    public InvalidAnimalAgeException() {
        super(DEFFAULT_MESSAGE);
    }

    public InvalidAnimalAgeException(String message) {
        super(message);
    }
}

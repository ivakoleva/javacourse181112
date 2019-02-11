package com.musala.javacourse181112.company.exceptions;

public class InvalidAnimalNameException extends IllegalArgumentException {

    private static final String DEFFAULT_MESSAGE = "Animal name cannot be null.";

    public InvalidAnimalNameException() {
        super(DEFFAULT_MESSAGE);
    }

    public InvalidAnimalNameException(String message) {
        super(message);
    }
}

package com.musala.javacourse181112.company.exceptions;

public class InvalidAmountOfCommandsException extends IllegalArgumentException {

    private static final String DEFFAULT_MESSAGE = "Amount of commands cannot be less than 0.";

    public InvalidAmountOfCommandsException() {
        super(DEFFAULT_MESSAGE);
    }

    public InvalidAmountOfCommandsException(String message) {
        super(message);
    }
}

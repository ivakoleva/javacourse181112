package com.musala.javacourse181112.company.exceptions;

public class InvalidCenterNameException extends IllegalArgumentException {

    private static final String DEFFAULT_MESSAGE = "Center name cannot be null.";

    public InvalidCenterNameException() {
        super(DEFFAULT_MESSAGE);
    }

    public InvalidCenterNameException(String message) {
        super(message);
    }
}

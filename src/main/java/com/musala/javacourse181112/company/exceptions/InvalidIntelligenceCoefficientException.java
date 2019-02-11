package com.musala.javacourse181112.company.exceptions;

public class InvalidIntelligenceCoefficientException  extends IllegalArgumentException {

    private static final String DEFFAULT_MESSAGE = "Intelligence coefficient cannot be less than 0.";

    public InvalidIntelligenceCoefficientException() {
        super(DEFFAULT_MESSAGE);
    }

    public InvalidIntelligenceCoefficientException(String message) {
        super(message);
    }
}

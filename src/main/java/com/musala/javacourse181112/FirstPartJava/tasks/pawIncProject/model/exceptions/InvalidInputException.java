package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.exceptions;

public class InvalidInputException extends Throwable {
    @Override
    public String getMessage() {
        return "InvalidInputException";
    }
}

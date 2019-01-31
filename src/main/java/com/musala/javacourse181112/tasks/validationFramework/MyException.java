package com.musala.javacourse181112.tasks.validationFramework;

public class MyException extends Exception {
    public MyException() {
    }

    MyException(final String message) {
        super(message);
    }
}

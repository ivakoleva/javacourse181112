package com.musala.javacourse181112.FirstPartJava.oop.votesexercise.service.exception;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class PersonAlreadyVotedQuestionException extends Exception {
    public PersonAlreadyVotedQuestionException() {
    }

    public PersonAlreadyVotedQuestionException(String message) {
        super(message);
    }

    public PersonAlreadyVotedQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonAlreadyVotedQuestionException(Throwable cause) {
        super(cause);
    }

    public PersonAlreadyVotedQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

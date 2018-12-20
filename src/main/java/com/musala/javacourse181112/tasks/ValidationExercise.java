package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.exceptions.ValidationException;
import com.musala.javacourse181112.exceptions.Validator;

public class ValidationExercise implements Validator<String> {
    @Override
    public void validate(String value) throws ValidationException {
        if (value.length() != 10) {
            throw new ValidationException(value + " not valid EGN.");
        }
    }

    public static void main(String[] args) throws ValidationException {
        ValidationExercise validationExercise = new ValidationExercise();
        validationExercise.validate("1234567890");
        validationExercise.validate("123");
    }
}

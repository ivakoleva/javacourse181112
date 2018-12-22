package com.musala.javacourse181112;

import com.musala.javacourse181112.exceptions.ValidationException;
import com.musala.javacourse181112.exceptions.Validator;

public class ValidationExercise implements Validator<String> {
    @Override
    public void validate(String value) throws ValidationException {
        if (value.length() != 10){
            throw new ValidationException(value + " not valid EGN. ");
        }
    }
}

package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.exceptions.ValidationException;
import com.musala.javacourse181112.exceptions.Validator;

import java.util.regex.Pattern;

public class ValidatorExercise implements Validator<String> {
    @Override
    public void validate(String egn) throws ValidationException {
        if (Pattern.matches("^[0-9]{10}$", egn)) {
            throw new ValidationException(egn + " not valid EGN.");
        }

    }
    public static void main(String[] args) throws ValidationException {
        ValidatorExercise validationExercise = new ValidatorExercise();
        validationExercise.validate("1234567890");
        validationExercise.validate("123");
    }

}

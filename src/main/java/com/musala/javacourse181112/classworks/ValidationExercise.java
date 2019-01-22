package com.musala.javacourse181112.classworks;

import com.musala.javacourse181112.exceptions.ValidationException;
import com.musala.javacourse181112.exceptions.Validator;

public class ValidationExercise implements Validator<String> {
    @Override
    public void validate(String value) throws ValidationException {
        if (value.length() != 10) {
            throw new ValidationException(value + " EGN isn't valid");
        }
        try {
            Long.parseLong(value);
        } catch (NumberFormatException e) {
            throw new ValidationException("Egn must contain only numbers");
        }
        int yearBorn = Integer.parseInt(value.substring(0, 2));
        if (yearBorn < 0) {
            throw new ValidationException("year must be a positive number between 0 and 99");
        }
        int monthBorn = Integer.parseInt(value.substring(2, 4));
        if (monthBorn < 1 || monthBorn > 12) {
            throw new ValidationException("month must be between 1(January) and 12(December)");
        }
        int dayOfMonthBorn = Integer.parseInt(value.substring(4, 6));
        if (dayOfMonthBorn < 1 || dayOfMonthBorn > 31) {

            throw new ValidationException("These months have less than " + dayOfMonthBorn +"days");
        }else{
            if (monthBorn == 2 && ((1900+yearBorn) % 400 != 0 ||(1900+yearBorn) % 4!= 0) && dayOfMonthBorn > 28) {
                throw new ValidationException("February has only 28 days");
            } else if (monthBorn == 2 && ((1900+yearBorn) % 400 == 0 ||(1900+yearBorn) % 4== 0) && dayOfMonthBorn > 28){
                throw new ValidationException("February has only 29 days");
            }
        }
    }

    public static void main(String[] args) {
        ValidationExercise validationExercise = new ValidationExercise();
        try {
//            validationExercise.validate("123457");
            validationExercise.validate("9802286340");
        } catch (ValidationException e) {
            e.printStackTrace();
        }
    }
}

package com.musala.javacourse181112.exceptions;

public class EGN extends ValidationException implements Validator {
    @Override
    public void validate(Object value) throws ValidationException {
        String egn = (String) value;
        if (egn.length() != 10) {
            throw new ValidationException("Expected length of 10, actual:" + egn.length());
        }
        try {
            Long.parseLong(egn);
        } catch (NumberFormatException ex) {
            throw new ValidationException("EGN should contain only numbers!");
        }

        final int year = Integer.parseInt(egn.substring(0, 2));
        if (year < 0 || year > 99) {
            throw new ValidationException("Expected year between 00..99,  actual:" + year);
        }

        final int month = Integer.parseInt(egn.substring(2, 4));
        if (month < 1 || month > 12) {
            throw new ValidationException("Month should be between 1..12,  actual:" + month);
        }

        final int day = Integer.parseInt(egn.substring(4, 6));
        if (day < 1 || day > 31) {
            throw new ValidationException("Invalid day " + day);
        }
    }

    public static void main(final String[] args) throws ValidationException {
        EGN egn = new EGN();
        egn.validate("9004135240");
    }
}

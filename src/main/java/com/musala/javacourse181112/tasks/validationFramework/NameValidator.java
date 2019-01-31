package com.musala.javacourse181112.tasks.validationFramework;

import java.lang.reflect.Field;
import java.util.Arrays;

class NameValidator {

    void validating(final Object object) throws IllegalAccessException, MyException {
        final Field[] fields = object.getClass().getDeclaredFields();

        for (final Field field : fields) {
            if (field.isAnnotationPresent(StringLengthAnnotation.class)) {
                field.setAccessible(true);
                final StringLengthAnnotation stringLengthAnnotation = field.getAnnotation(StringLengthAnnotation.class);
                final int minLength = stringLengthAnnotation.minValue();
                final int maxLength = stringLengthAnnotation.maxValue();

                if (minLength > field.get(object).toString().length() || maxLength < field.get(object).toString().length()) {
                    throw new MyException("You have enter a string with length greater or equals to " + minLength
                            + " or string with length less or equals to " + maxLength);
                }
            }
        }
    }

    void validatingWithLambda(final Object object) throws IllegalAccessException, MyException {
        final Field[] fields = object.getClass().getDeclaredFields();

        Arrays.stream(fields).filter(field -> {
            field.isAnnotationPresent(StringLengthAnnotation.class);
            field.isAnnotationPresent(StringLengthAnnotation.class);
            field.setAccessible(true);
            return true;
        })
                .forEach(field -> {
                    try {
                        if (field.getAnnotation(StringLengthAnnotation.class).minValue() > field.get(object).toString().length() ||
                                field.getAnnotation(StringLengthAnnotation.class).maxValue() < field.get(object).toString().length()) {
                            throw new MyException("You have enter a string with length greater or equals to " + field.getAnnotation(StringLengthAnnotation.class).minValue()
                                    + " or string with length less or equals to " + field.getAnnotation(StringLengthAnnotation.class).maxValue());
                        }
                    } catch (IllegalAccessException | MyException e) {
                        e.printStackTrace();
                    }
                });
    }
}


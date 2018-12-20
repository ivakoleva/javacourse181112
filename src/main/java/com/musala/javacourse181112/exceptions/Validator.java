package com.musala.javacourse181112.exceptions;

/**
 * Created by Iva Koleva on 20.12.2018
 */
public interface Validator<T> {

    //boolean validate(T value);

    void validate(T value) throws ValidationException;
}

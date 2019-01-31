package com.musala.javacourse181112.tasks.validationFramework;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Person;

import java.util.Arrays;

public class TestClass {
    public static void main(final String[] args) {
        if(Validator.validate(Person.class)){

                Arrays.stream(Person.class.getDeclaredFields())
                        .filter(field -> field.isAnnotationPresent(StringLength.class))
                        .map(field -> "Field: " + field.getName())
                        .forEach(System.out::println);

        }
    }

}

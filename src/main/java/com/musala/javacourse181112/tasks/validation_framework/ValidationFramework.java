package com.musala.javacourse181112.tasks.validation_framework;

import com.musala.javacourse181112.oop.votesexercise.model.Person;

import java.util.Scanner;

public class ValidationFramework {
    /*
     *** annotate Person name field using StringLength, min 1 max 255
     *** implement method performing entity validation
     */

    public static void main(final String[] args) {
        Person person = new Person();
        person.setName("");
        System.out.println(person.getName());
    }

    Scanner scanner = new Scanner(System.in);

    @StringLengthAnnotation(minValue = 1, maxValue = 255)
    Person person = new Person();


    public void setPerson() {
        if (entityValidation()) {
            this.person = person;
            person.setName(scanner.nextLine());
        }

    }

    public boolean entityValidation() {
        boolean validEntity = false;
        if (person.getName().toCharArray() != null && person.getName().toCharArray().length < 255) ;
        {
            validEntity = true;
        }
        return validEntity;
    }

//    @StringLengthAnnotation(minValue = 1, maxValue = 255)


}

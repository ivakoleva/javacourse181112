package com.musala.javacourse181112.tasks.validation_framework;

import java.util.Scanner;

public class ValidationFramework {
    static Scanner scanner = new Scanner(System.in);
    /*
     *** annotate Person name field using StringLength, min 1 max 255
     *** implement method performing entity validation
     */

    public static void main(final String[] args) {
        Person person = new Person();
        System.out.print("Set person's name: ");
        person.setName("");
        System.out.println(person.getName());
//        if (entityValidation()) {
//            System.out.println("Validation successful " + person.getName());
//        } else {
//            System.out.println("Invalid name!");
//        }
    }

    @StringLengthAnnotation(minValue = 1, maxValue = 255)
    static Person person = new Person();

    public static boolean entityValidation() {
        boolean validEntity = false;
        person.setName(scanner.nextLine());
        if (person.getName().toCharArray().length >= 1 && person.getName().toCharArray().length < 255) {
            validEntity = true;
        }
        return validEntity;
    }

//    @StringLengthAnnotation(minValue = 1, maxValue = 255)


}

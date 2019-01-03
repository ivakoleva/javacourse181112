package com.musala.javacourse181112.tasks.calculatorExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> listOfPersons = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            System.out.print("Enter a name: ");
            person.setPersonName(scanner.next());
            System.out.print("Enter age: ");
            person.setPersonAge(scanner.nextInt());
            listOfPersons.add(person);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + listOfPersons.get(i).getPersonName() + "; age: " + listOfPersons.get(i).getPersonAge());
        }

        for (int i = 0; i < 10; i++) {
            AdditionalYears additionalYears = new AdditionalYears();
            System.out.println("Add years to " + listOfPersons.get(i).getPersonName());
            additionalYears.setYearsToAdd(scanner.nextInt());
            System.out.println("Now " + listOfPersons.get(i).getPersonName() + " is " + calculateAge(listOfPersons.get(i), additionalYears));
        }

    }

    public static int calculateAge(Person person, AdditionalYears additionalYears) {
        int calculatedAge = person.getPersonAge() + additionalYears.getYearsToAdd();
        return calculatedAge;
    }
}

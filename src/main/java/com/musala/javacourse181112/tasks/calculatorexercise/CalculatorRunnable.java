package com.musala.javacourse181112.tasks.calculatorexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculatorRunnable {
    public static void main(String[] args) {
        int num;
        List<Person> people = new ArrayList<>();
        int numberOfPeople = 10;
        Calculator calculator = new Calculator();

        Random generator = new Random();
        int addedYears = generator.nextInt(6);
        calculator.setAddedYears(addedYears);
        System.out.println("Will add " + addedYears + "years.");

        for (int i = 1; i <= numberOfPeople; i++) {
            num = generator.nextInt(100);
            people.add(new Person("person" + i, num));
        }

        for (Person person : people) {
            System.out.println(person);
            calculator.setPerson(person);
            System.out.println("New Age:" + calculator.futureAge());
        }
    }
}

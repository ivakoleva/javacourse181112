package com.musala.javacourse181112.tasks.calculator_exercise;

import com.musala.javacourse181112.tasks.methods_exercises.Person;

import java.util.ArrayList;
import java.util.List;

public class CalculatorExecutor {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        char[] charset = {'a', 'b', 'c', 'r', 't', 'q'};
        for (int i = 0; i < 10; i++) {
            people.add(new Person(RandomPersonNameGenerator.generateName(charset, 5, 10, i + 10));
        }
        Calculator calculator = new Calculator();
        for (Person person : people) {
            calculator.setPerson(person);
            calculator.setYearsToAdd(10);
            System.out.println(person.getFirstName() + " " + calculator.getFutureAge());
        }
    }
}

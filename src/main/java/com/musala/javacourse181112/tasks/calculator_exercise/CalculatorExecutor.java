package com.musala.javacourse181112.tasks.calculator_exercise;

import com.musala.javacourse181112.tasks.methods_exercises.Person;

import java.util.ArrayList;
import java.util.List;

public class CalculatorExecutor {
    public static void main(final String[] args) {
        final List<Person> people = new ArrayList<>();
        final String charset = "asdsdgshjtkuykilrilrurlieymshnnanaga";
        final RandomNameGenerator randomNameGenerator = new RandomNameGenerator(5, 10, charset);

        for (int i = 0; i < 10; i++) {
            people.add(new Person(randomNameGenerator.generate(), i + 10));
        }

        final Calculator<Person> ageCalculator = new Calculator<>();
        for (Person person : people) {
            ageCalculator.setPerson(person);
            ageCalculator.setYearsToAdd(10);
            System.out.println(person.getFirstName() + " " + ageCalculator.getFutureAge());
        }
    }
}

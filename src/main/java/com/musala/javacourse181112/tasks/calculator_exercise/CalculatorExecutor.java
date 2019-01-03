package com.musala.javacourse181112.tasks.calculator_exercise;

import com.musala.javacourse181112.tasks.methods_exercises.Person;

import java.util.ArrayList;
import java.util.List;

public class CalculatorExecutor {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        String charset = "asdsdgshjtkuykilrilrurlieymshnnanaga";
        RandomPersonNameGenerator randomPersonNameGenerator = new RandomPersonNameGenerator(charset, 5, 10);
        for (int i = 0; i < 10; i++) {
            people.add(new Person(randomPersonNameGenerator.generateName(), i + 10));
        }
        Calculator<Person> calculator = new Calculator<>();
        for (Person person : people) {
            calculator.setPerson(person);
            calculator.setYearsToAdd(10);
            System.out.println(person.getFirstName() + " " + calculator.getFutureAge());
        }
    }
}

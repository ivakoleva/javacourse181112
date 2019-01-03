package com.musala.javacourse181112.tasks.FutureAgeCalcApp;


import java.util.ArrayList;
import java.util.List;

public class CalculatorExecuter {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        String charset = "asdfghjklpoiuytrewq";
        RandomName randomNameGenerator = new RandomName(charset, 5, 10);
        for (int i = 0; i < 10; i++) {
            people.add(new Person(randomNameGenerator.generateName(), i + 10));
        }
        AgeCalculator<Person> calculator = new AgeCalculator<>();
        for (Person person : people) {
            calculator.setPerson(person);
            calculator.setYearsToAdd(10);
            System.out.println(person.getName() + " " + calculator.getFutureAge());
        }
    }
}


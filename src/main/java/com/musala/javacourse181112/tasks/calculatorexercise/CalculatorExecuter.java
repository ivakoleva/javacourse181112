package com.musala.javacourse181112.tasks.calculatorexercise;

import java.util.ArrayList;
import java.util.List;

public class CalculatorExecuter {
    public static void main(final String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i=0; i <= 10; i++) {
            people.add(new Person("" + i,i+2));
        }

        Calculator calculator = new Calculator();
        for (Person person : people) {
            calculator.setPerson(person);
            calculator.yearsToAdd(20);
            System.out.println(person.getName() + " " + calculator.getFutureAge());
        }

    }

}

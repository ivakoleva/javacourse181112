package com.musala.javacourse181112.tasks.calculatorexersice;

import java.util.ArrayList;
import java.util.List;

public class Executer {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int numberOfTheChar=65+i;
            people.add(new Person((char) numberOfTheChar+ ". " +(char) numberOfTheChar+".",
                    i + (int)(Math.random()*50)));
        }

        Calculator calculator = new Calculator();
        for (Person person : people) {
            calculator.setPerson(person);
            calculator.setYearsToAdd(10);
            System.out.println("Person name:"+person.getName() + " His/Her Future Age:" + calculator.getFutureAge());
        }
    }
}

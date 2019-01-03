package com.musala.javacourse181112.tasks.calculatorexercise;

public class Calculator {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setAge(15);
        person1.setAgeToAdd(3);

        System.out.println("The person's future age is: " + calculateFutureAge(person1));
    }

    public static int calculateFutureAge(Person person) {
        return person.getAge() + person.getAgeToAdd();
    }
}

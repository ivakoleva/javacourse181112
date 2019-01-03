package com.musala.javacourse181112.tasks.calculatorexercise;

public class CalculatorRunner {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.setAge(10);
        person2.setAge(11);
        person3.setAge(12);
        person1.setAgeToAdd(2);
        person2.setAgeToAdd(3);
        person3.setAgeToAdd(4);
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculateYears(person1));


    }
}

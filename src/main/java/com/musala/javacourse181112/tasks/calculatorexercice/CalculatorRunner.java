package com.musala.javacourse181112.tasks.calculatorexercice;

import java.util.ArrayList;
import java.util.List;

public class CalculatorRunner {
    private static final int NUMBER_OF_PEOPLE =10;
    public static void main(final String[] args) {
       // Person person1=new Person();


        List<Person> people=new ArrayList<>();
        for(int i=0;i<NUMBER_OF_PEOPLE;i++){
            people.add(new Person("Person "+i,i+10));
        }
        Calculator calculator=new Calculator();
        for(Person person : people){
            calculator.setPerson(person);
            calculator.setAgeToAdd(10);
            System.out.println(calculator);
        }


    }
}



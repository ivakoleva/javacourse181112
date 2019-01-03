package com.musala.javacourse181112.tasks.FutureAgeCalcApp;


import java.util.ArrayList;
import java.util.List;

public class CalcExecutor {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i<10; i++){
            people.add(new Person(" " + i + " " + i, i+10));
        }
        AgeCalculator calculator = new AgeCalculator();
        for (Person person : people){
            calculator.setPerson(person);
            calculator.setYearsToadd(10);
            System.out.println(person.getName() + " " + calculator.getFutureAge());
        }


    }

}

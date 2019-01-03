package com.musala.javacourse181112.tasks.calculatorexercise;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//        Person person4 = new Person();
//        Person person5 = new Person();
//        Person person6 = new Person();
//        Person person7 = new Person();
//        Person person8 = new Person();
//        Person person9 = new Person();
//        Person person10 = new Person();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person());
        }
        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).setAge(10);
        }
        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).setAgeToAdd(i);

        }
        calculateFutureAge(personList);
//        person1.setAge(15);
//        person1.setAgeToAdd(3);
//        person2.setAge(16);
//        person2.setAgeToAdd(4);
//        person3.setAge(17);
//        person3.setAgeToAdd(5);
//        person4.setAge(18);
//        person4.setAgeToAdd(6);
//        person5.setAge(19);
//        person5.setAgeToAdd(7);
//        person6.setAge(20);
//        person6.setAgeToAdd(8);
//        person7.setAge(21);
//        person7.setAgeToAdd(9);
//        person8.setAge(22);
//        person8.setAgeToAdd(10);
//        person9.setAge(23);
//        person9.setAgeToAdd(1);
//        person10.setAge(24);
//        person10.setAgeToAdd(32);


    }

    public static void calculateFutureAge(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println("Person" + i + "'s age is : " + (personList.get(i).getAge() + personList.get(i).getAgeToAdd()));
        }
    }
}

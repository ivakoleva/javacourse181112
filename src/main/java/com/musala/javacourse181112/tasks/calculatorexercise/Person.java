package com.musala.javacourse181112.tasks.calculatorexercise;

public class Person {
    private String name;
    private int age;

    public Person(String personName, int personAge) {
        setName(personName);
        setAge(personAge);
    }

     int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    void setName(String personName) {
        this.name = personName;
    }

    void setAge(int personAge) {
        this.age = personAge;
    }

}

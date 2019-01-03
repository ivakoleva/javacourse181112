package com.musala.javacourse181112.tasks.calculatorexercice;

public class Person implements Calculatable{
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name=name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

package com.musala.javacourse181112.tasks.methods_exercises;

public class Person {
    private String firstName;
    private String familyName;
    private int age;

    public Person(String Name, int age) {
        setFirstName(Name);
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        int i = name.indexOf(" ");
        firstName = name.substring(0, i);
        familyName = name.substring(i + 1);
    }

}

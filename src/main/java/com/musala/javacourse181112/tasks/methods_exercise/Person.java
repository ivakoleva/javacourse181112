package com.musala.javacourse181112.tasks.methods_exercise;

public class Person {
    private String firstName;
    private String familyName;

    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public Person() {

    }

    public String getName() {
        return firstName + " " + familyName;
    }

    public void setName(String name) {
        int i = name.indexOf(" ");
        firstName = name.substring(0, i);
        familyName = name.substring(i + 1);
    }
}

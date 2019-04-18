package com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01.Users;

public class Person {
        private String name;
        private String egn;
        //TODO: подходяща колекция за множество от стойности от enum-и
        private String role;

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


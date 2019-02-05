package com.musala.javacourse181112.pawinc.animals;

import com.musala.javacourse181112.pawinc.CleanseStatus;

public class Animal {
    String name;
    int age;
    CleanseStatus cleanseStatus;
    String adoptionCenter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CleanseStatus getCleanseStatus() {
        return cleanseStatus;
    }

    public void setCleanseStatus(CleanseStatus cleanseStatus) {
        this.cleanseStatus = cleanseStatus;
    }

    public Animal() {
    }

    public Animal(String name, int age,String adoptionCenter) {
        this.name = name;
        this.age = age;
        this.adoptionCenter=adoptionCenter;
        this.cleanseStatus = CleanseStatus.UNCLEANSED;
    }
}

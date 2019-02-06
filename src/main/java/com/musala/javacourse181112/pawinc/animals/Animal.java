package com.musala.javacourse181112.pawinc.animals;

import com.musala.javacourse181112.pawinc.AnimalStatus;

public class Animal {
   private String name;
    private int age;
    private AnimalStatus animalStatus;
    private String adoptionCenter;

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

    public AnimalStatus getAnimalStatus() {
        return animalStatus;
    }

    public void setAnimalStatus(AnimalStatus animalStatus) {
        this.animalStatus = animalStatus;
    }

    public String getAdoptionCenter() {
        return adoptionCenter;
    }

    public Animal() {
    }

    public Animal(String name, int age,String adoptionCenter) {
        this.name = name;
        this.age = age;
        this.adoptionCenter=adoptionCenter;
        this.animalStatus = AnimalStatus.UNCLEANSED;
    }
}

package com.musala.javacourse181112.pawinc.model.animal;

public class Cat extends Animal {

    private int intelligence;

    public Cat(String name, int age, String adoptionCenter, int intelligence) {
        super(name, age, adoptionCenter);
        this.intelligence = intelligence;
    }
}
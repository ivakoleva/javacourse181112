package com.musala.javacourse181112.pawinc.model.animal;

public class Dog extends Animal {

    private int commands;

    public Dog(String name, int age, String adoptionCenter, int commands) {
        super(name, age, adoptionCenter);
        this.commands = commands;
    }
}
package com.musala.javacourse181112.pawinc.animals;

import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;

public class Dog extends Animal {
    private int amountOfCommands;
    private AdoptionCenter adoptionCenter;


    public Dog(String name, int age, int commands, AdoptionCenter adoptionCenter) {
        super(name, age);
        this.amountOfCommands = commands;
        this.adoptionCenter = adoptionCenter;
    }

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }

    @Override
    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    @Override
    public void setAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;

    }

}

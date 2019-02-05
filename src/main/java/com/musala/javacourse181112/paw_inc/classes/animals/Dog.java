package com.musala.javacourse181112.paw_inc.classes.animals;

import com.musala.javacourse181112.paw_inc.classes.centers.AdoptionCenter;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class Dog extends Animal {
    private int amountOfCommands;


    public Dog(String name, int age, int amountOfCommands, AdoptionCenter adoptionCenter) {
        super(name, age);
        this.amountOfCommands = amountOfCommands;
        this.adoptionCenter = adoptionCenter;
    }

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }

    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }
}

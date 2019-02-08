package com.musala.javacourse181112.paw_inc.model.animal;

import com.musala.javacourse181112.paw_inc.model.center.AdoptionCenter;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 *
 * Dog class
 * Extends Animal
 */
public class Dog extends Animal {
    private int amountOfCommands;

    public Dog(final String name, final int age, final int amountOfCommands, final AdoptionCenter adoptionCenter) {
        super(name, age);
        this.amountOfCommands = amountOfCommands;
        this.adoptionCenter = adoptionCenter;
    }

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(final int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }

    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(final AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }
}

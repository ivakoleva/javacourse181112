package com.musala.javacourse181112.pawinc.Center;

import com.musala.javacourse181112.pawinc.Animal.Animal;
import com.musala.javacourse181112.pawinc.Animal.CleansingStatus;

import java.util.ArrayList;

public class AdoptionCenter extends Center {

    public AdoptionCenter(String name) {
        super(name);
    }

    public void cleanseAnimals(CleansingCenter cleansingCenter) {
        ArrayList<Animal> uncleansedAnimals = new ArrayList<>();

        for (Animal animal : this.storedAnimals) {
            if (animal.getCleansingStatus() == CleansingStatus.UNCLEASED) {
                uncleansedAnimals.add(animal);
            }
        }

        this.storedAnimals.removeAll(uncleansedAnimals);
        cleansingCenter.setStoredAnimalsCenters(uncleansedAnimals, this);
    }

    public void adoptAnimals() {
        ArrayList<Animal> adoptedAnimals = new ArrayList<>();

        for (Animal animal : this.storedAnimals) {
            if (animal.getCleansingStatus() == CleansingStatus.CLEANSED) {
                adoptedAnimals.add(animal);
            }
        }
        this.storedAnimals.removeAll(adoptedAnimals);

    }

}

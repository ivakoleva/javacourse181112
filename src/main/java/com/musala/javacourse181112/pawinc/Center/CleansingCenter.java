package com.musala.javacourse181112.pawinc.Center;

import com.musala.javacourse181112.pawinc.Animal.Animal;
import com.musala.javacourse181112.pawinc.Animal.CleansingStatus;

import java.util.ArrayList;
import java.util.HashMap;

public class CleansingCenter extends Center {

    private HashMap<Animal, AdoptionCenter> storedCentersAnimals = new HashMap<>();

    public CleansingCenter(String name) {
        super(name);
    }

    public void setStoredAnimalsCenters(ArrayList<Animal> storedAnimals, AdoptionCenter adoptionCenter) {
        this.storedAnimals.addAll(storedAnimals);
        for (Animal animal : this.storedAnimals) {
            this.storedCentersAnimals.put(animal, adoptionCenter);
        }
    }

    public void cleanse() {
        for (Animal animal : this.storedAnimals) {
            AdoptionCenter adoptionCenter = storedCentersAnimals.get(animal);
            animal.setCleansingStatus(CleansingStatus.CLEANSED);
            adoptionCenter.addAnimal(animal);
        }
        this.storedAnimals.clear();
        this.storedCentersAnimals.clear();
    }


}

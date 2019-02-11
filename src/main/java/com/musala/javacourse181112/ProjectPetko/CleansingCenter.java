package com.musala.javacourse181112.ProjectPetko;

import java.util.Set;
import java.util.TreeSet;

public class CleansingCenter extends Center {
    public CleansingCenter(String newName) {
        super(newName);
    }

    public Set<Animal> cleanse() {
        Set<Animal> uncleansedAnimals = getStoredAnimals();
        Set<Animal> cleansedAnimals = new TreeSet<>();

        for (Animal a : uncleansedAnimals) {
            a.setCleansingStatus(true);
            cleansedAnimals.add(a);
        }

        uncleansedAnimals.removeAll(cleansedAnimals);

        return cleansedAnimals;
    }
}

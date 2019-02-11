package com.musala.javacourse181112.ProjectPetko;

import java.util.Set;
import java.util.TreeSet;

public class CastrationCenter extends Center{
    public CastrationCenter(String newName) {
        super(newName);
    }

    public Set<Animal> castrate() {
        Set<Animal> noncastratedAnimals = getStoredAnimals();
        Set<Animal> castratedAnimals = new TreeSet<>();

        for (Animal a : noncastratedAnimals) {
            a.setCastrationStatus(true);
            castratedAnimals.add(a);
        }

        noncastratedAnimals.removeAll(castratedAnimals);

        return castratedAnimals;
    }
}

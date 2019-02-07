package com.musala.javacourse181112.paw_inc.classes.centers;

import com.musala.javacourse181112.paw_inc.classes.animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */

public class AdoptionCenter implements Center {
    private String name;
    private List<Animal> animals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> adoptAnimals() {
        final List<Animal> adoptedAnimals = new ArrayList<>();
        final Iterator<Animal> animalIterator = animals.iterator();

        for (; animalIterator.hasNext(); ) {
            final Animal animal = animalIterator.next();
            if (animal.isCleansed()) {
                adoptedAnimals.add(animal);
                animalIterator.remove();
            }
        }
        return adoptedAnimals;
    }

    public void sendForCleansing(final CleansingCenter cleansingCenter) {
        final Iterator<Animal> animalIterator = animals.iterator();
        for (; animalIterator.hasNext(); ) {
            final Animal animal = animalIterator.next();
            if (!animal.isCleansed()) {
                cleansingCenter.getAnimals().add(animal);
                animalIterator.remove();
            }
        }
    }

    public void sendForCastration(final CastrationCenter castrationCenter) {
        final Iterator<Animal> animalIterator = animals.iterator();
        for (; animalIterator.hasNext(); ) {
            final Animal animal = animalIterator.next();
            if (!animal.isCastrated()) {
                castrationCenter.getAnimals().add(animal);
                animalIterator.remove();
            }
        }
    }
}

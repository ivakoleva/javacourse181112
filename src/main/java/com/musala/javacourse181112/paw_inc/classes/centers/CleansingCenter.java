package com.musala.javacourse181112.paw_inc.classes.centers;

import com.musala.javacourse181112.paw_inc.classes.animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */

public class CleansingCenter implements Center {
    private String name;
    private List<Animal> animals;

    public List<Animal> cleanseAnimals() {
        Iterator<Animal> animalIterator = animals.iterator();
        List<Animal> cleansedAnimals = new ArrayList<>();
        for (; animalIterator.hasNext(); ) {
            Animal animal = animalIterator.next();
            animal.cleanse();
            animal.getAdoptionCenter().getAnimals().add(animal);
            cleansedAnimals.add(animal);
            animalIterator.remove();
        }
        return cleansedAnimals;
    }

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
}

package com.musala.javacourse181112.paw_inc.model.center;

import com.musala.javacourse181112.paw_inc.model.animal.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aykut Ismailov on 6.2.2019 г.
 */
public class CastrationCenter implements Center {
    private String name;
    private List<Animal> animals;

    public List<Animal> castrateAnimals() {
        final List<Animal> castratedAnimals = new ArrayList<>();
        final Iterator<Animal> animalIterator = animals.iterator();
        for (; animalIterator.hasNext(); ) {
            Animal animal = animalIterator.next();
            animal.castrate();
            animal.getAdoptionCenter().getAnimals().add(animal);
            castratedAnimals.add(animal);
            animalIterator.remove();
        }
        return castratedAnimals;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void setAnimals(final List<Animal> animals) {
        this.animals = animals;
    }
}

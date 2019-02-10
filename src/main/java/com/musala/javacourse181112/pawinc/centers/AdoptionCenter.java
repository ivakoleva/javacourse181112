package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdoptionCenter implements Center {
    private String name;
    private List<Animal> storedAnimalsList;

    public AdoptionCenter(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Animal> getStoredAnimalsList() {
        return storedAnimalsList;
    }

    @Override
    public void setStoredAnimalsList(List<Animal> storedAnimalsList) {
        this.storedAnimalsList = storedAnimalsList;

    }

    public void addAnimalToStoredAnimals(Animal animal) {
        storedAnimalsList.add(animal);
    }

    //Sends animals for cleansing to the cleansing center
    public void sendForCleansing(CleansingCenter cleansingCenter) {
        final Iterator<Animal> animalIterator = storedAnimalsList.iterator();
        for (; animalIterator.hasNext(); ) {
            final Animal animal = animalIterator.next();
            if (!animal.isCleansed()) {
                cleansingCenter.getStoredAnimalsList().add(animal);
                animalIterator.remove();
            }
        }
    }

    public void sendForCastration(CastrationCenter castrationCenter) {
        final Iterator<Animal> animalIterator = storedAnimalsList.iterator();
        for (; animalIterator.hasNext(); ) {
            final Animal animal = animalIterator.next();
            if (!animal.isCastrated()) {
                castrationCenter.getStoredAnimalsList().add(animal);
                animalIterator.remove();
            }
        }
    }


    //All animals that are cleansed get adopted and removed from the stored animals list
    public List<Animal> adoptAnimals() {
        final List<Animal> animalsForAdoptionList = new ArrayList<>();

        final Iterator<Animal> animalIterator = storedAnimalsList.iterator();

        for (; animalIterator.hasNext(); ) {
            final Animal animal = animalIterator.next();
            if (animal.isCleansed()) {
                animalsForAdoptionList.add(animal);
                animalIterator.remove();
            }
        }
        return animalsForAdoptionList;
    }
}

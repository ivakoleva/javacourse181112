package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.List;

public class CleansingCenter implements Center {
    private String name;
    private List<Animal> storedAnimalsList;

    public CleansingCenter() {

    }

    public CleansingCenter(String name) {
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

    //cleanses all animals from list of storedAnimals
    public void cleanse() {
        storedAnimalsList.forEach(animal -> animal.setCleansingStatus(true));

    }
}

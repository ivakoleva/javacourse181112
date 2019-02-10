package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.List;

public class CastrationCenter implements Center {
    private String name;
    private List<Animal> storedAnimalsList;

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

    public CastrationCenter(String name) {
        this.name = name;
    }

    public void castrate() {
        storedAnimalsList.forEach(animal -> animal.setCastrationStatus(true));
    }
}

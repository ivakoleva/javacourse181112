package com.musala.javacourse181112.company.centers.models;

import com.musala.javacourse181112.company.animals.Animal;
import com.musala.javacourse181112.company.animals.statuses.CastrateStatus;
import com.musala.javacourse181112.company.animals.statuses.CleansingStatus;
import com.musala.javacourse181112.company.centers.Center;

import java.util.ArrayList;
import java.util.List;

public class AdoptionCenter extends Center {

    private List<Animal> storedAnimals;
    private List<String> adoptedAnimals;

    public AdoptionCenter(String name) {
        super(name);
        this.storedAnimals = new ArrayList<>();
        this.adoptedAnimals = new ArrayList<>();
    }

    public void registerAnimal(Animal animal) {
        storedAnimals.add(animal);
    }

    public void returnBackCleansedAnimals(List<Animal> cleansedAnimals) {
        storedAnimals.addAll(cleansedAnimals);
    }

    public void returnBackCastratedAnimals(List<Animal> castratedAnimals) {
        storedAnimals.addAll(castratedAnimals);
    }

    public List<Animal> getStoredUncleansedAnimals() {
        List<Animal> animalsForCleansing = new ArrayList<>();
        addAnimalsForCleansing(animalsForCleansing);
        return animalsForCleansing;
    }

    public List<Animal> getStoredNonCastratedAnimals() {
        List<Animal> animalsForCastration = new ArrayList<>();
        addAnimalsForCastration(animalsForCastration);
        return animalsForCastration;
    }

    public void adoptedAnimals() {
        setAdoptedAnimals();
    }

    public int getAnimalsAwaitingAdoption() {
        return countingAwaitingAdoption();
    }

    public List<String> getAdoptedAnimals() {
        return this.adoptedAnimals;
    }

    private void addAnimalsForCastration(List<Animal> animalsForCastration) {
        for (Animal animal : storedAnimals) {
            if (animal.getCastrateStatus().equals(CastrateStatus.NonCastrated)) {
                animalsForCastration.add(animal);
            }
        }
        storedAnimals.removeAll(animalsForCastration);
    }

    private void addAnimalsForCleansing(List<Animal> animalsForCleansing) {
        for (Animal animal : storedAnimals) {
            if (animal.getCleansingStatus().equals(CleansingStatus.Uncleansed)) {
                animalsForCleansing.add(animal);
            }
        }
        storedAnimals.removeAll(animalsForCleansing);
    }

    private void setAdoptedAnimals() {
        List<Animal> candidates = new ArrayList<>(storedAnimals);
        for (Animal animal : candidates) {
            if (animal.getCleansingStatus().equals(CleansingStatus.Cleansed)) {
                adoptedAnimals.add(animal.getName());
                storedAnimals.remove(animal);
            }
        }
    }

    private int countingAwaitingAdoption() {
        int counter = 0;
        for (Animal storedAnimal : storedAnimals) {
            if (storedAnimal.getCleansingStatus().equals(CleansingStatus.Cleansed)) {
                counter++;
            }
        }
        return counter;
    }
}

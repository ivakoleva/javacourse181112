package com.musala.javacourse181112.paw_inc.centers;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;
import com.musala.javacourse181112.paw_inc.animals.Animal;
import com.musala.javacourse181112.paw_inc.enums.CastrationStatus;

import java.util.ArrayList;
import java.util.List;

public class CastrationCenter extends Center {
    private final List<Animal> castratedAnimals = new ArrayList<>();

    public CastrationCenter(String name) {
        super(name);
    }

    public List<Animal> getCastratedAnimals() {
        return castratedAnimals;
    }

    public void castrateAll() {
        for (Animal animal : animalList) {
            animal.setCastrationStatus(CastrationStatus.CASTRATED);
            for (AdoptionCenter adoptionCenter : AnimalCenterManager.getInstance().getAdoptionCenters()) {
                if (adoptionCenter.getName().equals(animal.getAdoptionCenter())) {
                    adoptionCenter.getAnimalList().add(animal);
                }
            }
        }
        castratedAnimals.addAll(animalList);
        animalList.clear();

    }

}

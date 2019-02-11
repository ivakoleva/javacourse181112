package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.AnimalCenterManager;
import com.musala.javacourse181112.pawinc.CastrationStatus;
import com.musala.javacourse181112.pawinc.animals.Animal;

public class CastrationCenter extends Center {
    public CastrationCenter(String name) {
        super(name);
    }

    public void castrateAnimals() {
        for (Animal animal : storedAnimals) {
            animal.setCastrationStatus(CastrationStatus.CASTRATED);
            for (AdoptionCenter adoptionCenter : AnimalCenterManager.getAdoptionCenters()) {
                if (adoptionCenter.getName().equals(animal.getAdoptionCenterName())) {
                    adoptionCenter.getStoredAnimals().add(animal);
                }
            }
        }
        storedAnimals.clear();
    }
}

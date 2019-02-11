package com.musala.javacourse181112.paw_inc.centers;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;
import com.musala.javacourse181112.paw_inc.animals.Animal;
import com.musala.javacourse181112.paw_inc.enums.CleansingAndAdoptionStatus;

public class CleansingCenter extends Center {


    public CleansingCenter(String name) {
        super(name);
    }


    public void cleanseAll() {
        for (Animal animal : animalList) {
            animal.setCleansingAndAdoptionStatus(CleansingAndAdoptionStatus.CLEANSED);
            for (AdoptionCenter adoptionCenter : AnimalCenterManager.getInstance().getAdoptionCenters()) {
                if (adoptionCenter.getName().equals(animal.getAdoptionCenter())) {
                    adoptionCenter.getAnimalList().add(animal);
                }
            }
        }

        animalList.clear();


    }

}

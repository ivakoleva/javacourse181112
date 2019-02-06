package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.AnimalCenterManeger;
import com.musala.javacourse181112.pawinc.AnimalStatus;
import com.musala.javacourse181112.pawinc.animals.Animal;

public class CleansingCenter extends Center {


    public CleansingCenter(String name) {
        super(name);
    }


    public void cleanseAll() {
        for (Animal animal : animalList) {
            animal.setAnimalStatus(AnimalStatus.CLEANSED);
            for (AdoptionCenter adoptionCenter : AnimalCenterManeger.getInstance().getAdoptionCenters()) {
                if (adoptionCenter.getName().equals(animal.getAdoptionCenter())) {
                    adoptionCenter.getAnimalList().add(animal);
                }
            }
        }

        animalList.clear();


    }

}

package com.musala.javacourse181112.pawinc.centers;


import com.musala.javacourse181112.pawinc.AnimalCenterManager;
import com.musala.javacourse181112.pawinc.CleansingStatus;
import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Kristina Stoyanova on 5.2.2019 г.
 */
public class CleansingCenter extends Center {
    public CleansingCenter(String name) {
        super(name);
    }

    public void cleanseAnimals(){
        for(Animal animal: storedAnimals){
            animal.setCleansingStatus(CleansingStatus.CLEANSED);
            for(AdoptionCenter adoptionCenter:AnimalCenterManager.getAdoptionCenters()){
                if(adoptionCenter.getName().equals(animal.getAdoptionCenterName())){
                    adoptionCenter.getStoredAnimals().add(animal);
                }
            }
        }
        storedAnimals.clear();
    }
}

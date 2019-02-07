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
public class AdoptionCenter extends Center {
    private final List<Animal> adoptedAnimals = new ArrayList<>();

    public AdoptionCenter(String name) {
        super(name);
    }

    public void sendAnimalsForCleansing(String cleansingCenterName) {
        Iterator<Animal> iterator = storedAnimals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            for(CleansingCenter cleansingCenter:AnimalCenterManager.getCleansingCenters()) {
                if(cleansingCenter.getName().equals(cleansingCenterName))
                {
                    if (animal.getCleansingStatus().equals(CleansingStatus.NOT_CLEANSED)){
                        cleansingCenter.getStoredAnimals().add(animal);
                        iterator.remove();
                    }
                }

            }

        }
    }

    public void adoptAnimals() {
       Iterator<Animal> animalIterator = storedAnimals.iterator();
       while (animalIterator.hasNext()){
           Animal animal = animalIterator.next();
           if(animal.getCleansingStatus().equals(CleansingStatus.CLEANSED)){
               adoptedAnimals.add(animal);
               animalIterator.remove();
           }
       }
    }

    public List<Animal> getAdoptedAnimals() {
        return adoptedAnimals;
    }
}


package com.musala.javacourse181112.ProjectPetko;

import java.util.Set;
import java.util.TreeSet;

public class AdoptionCenter extends Center {
    public AdoptionCenter(String name) {
        super(name);
    }

    public void sendForCleansing(CleansingCenter cleansingCenter) {
        Set<Animal> uncleansedAnimals = new TreeSet<>();

        for(Animal a : getStoredAnimals()){
            if (a.getCleansingStatus() == false){
                uncleansedAnimals.add(a);
            }
        }

        Set<Animal> animalsForCleansing = cleansingCenter.getStoredAnimals();

        animalsForCleansing.addAll(uncleansedAnimals);
    }

    public void sendForCastration(CastrationCenter castrationCenter) {
        Set<Animal> noncastratedAnimals = new TreeSet<>();

        for(Animal a : getStoredAnimals()){
            if (a.getCastrationStatus() == false){
                noncastratedAnimals.add(a);
            }
        }

        Set<Animal> animalsForCastration = castrationCenter.getStoredAnimals();

        animalsForCastration.addAll(noncastratedAnimals);
    }


    public Set<Animal> adopt() {
        Set<Animal> storedAnimals = getStoredAnimals();
        Set<Animal> adoptedAnimals = new TreeSet<>();

        for(Animal a : storedAnimals){
            if(a.getCleansingStatus() == true) {
                adoptedAnimals.add(a);
            }
        }

        storedAnimals.removeAll(adoptedAnimals);

        return adoptedAnimals;
   }
}
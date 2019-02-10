package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.animal.Animal;
import com.musala.javacourse181112.pawinc.animal.Cat;
import com.musala.javacourse181112.pawinc.animal.Dog;
import com.musala.javacourse181112.pawinc.center.AdoptionCenter;
import com.musala.javacourse181112.pawinc.center.Center;
import com.musala.javacourse181112.pawinc.center.CleansingCenter;

import java.util.ArrayList;
import java.util.List;

class AnimalCenterManager {
    List<Center> adoptionCenterList = new ArrayList<>();
    List<Center> cleansingCenterList = new ArrayList<>();
    //    static int amountOfAdoptionCenters = adoptionCenterList.size();
//    static int amountOfCleansingCenters = cleansingCenterList.size();
    List<Animal> adoptedAnimals = new ArrayList<>();
    List<Animal> cleansedAnimals = new ArrayList<>();

    void registerCleansingCenter(String name) {
        // Registers a Cleansing center with the given name
        Center cleansingCenter = new CleansingCenter(name);
        cleansingCenter.setName(name);
        cleansingCenterList.add(cleansingCenter);
    }

    void registerAdoptionCenter(String name) {
        //Registers an Adoption center with the given name
        Center adoptionCenter = new AdoptionCenter(name);
        adoptionCenterList.add(adoptionCenter);
    }

    void registerDog(String name,
                     int age,
                     int learnedCommands,
                     String adoptionCenterName) {
        /*
         *   Registers a dog with the given name,
         *   age and amount of learned commands in the given Adoption center.
         */

        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);

        if (adoptionCenter != null) {
            Animal dog = new Dog(name, age, learnedCommands);
            dog.setAdoptionCenterName(adoptionCenterName);
            adoptionCenter.getStoredAnimals().add(dog);
        }
    }

    void registerCat(String name,
                     int age,
                     int intelligenceCoefficient,
                     String adoptionCenterName) {
        /*
         * Registers a cat with the given name,
         * age and intelligence coefficient in the given Adoption center.
         */

        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);

        if (adoptionCenter != null) {
            Animal cat = new Cat(name, age, intelligenceCoefficient);
            adoptionCenter.getStoredAnimals().add(cat);
        }
    }

    void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        /*
         *  Sends all UNCLEANSED animals from the given Adoption center
         *  to the given Cleansing center
         */
        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);
        Center cleansingCenter = findCleansingCenterByName(cleansingCenterName);

        for (Animal animal : (List<Animal>) adoptionCenter.getStoredAnimals()) {
            if (animal.isCleansed() == false) {
                adoptionCenter.getStoredAnimals().addAll(cleansingCenter.getStoredAnimals());
            }

        }
    }

    void cleanse(String cleansingCenterName) {
        /*
         * Cleanses all animals from the given Cleansing center
         * and returns them to their corresponding Adoption centers.
         */
        Center cleansingCenter = findCleansingCenterByName(cleansingCenterName);
        for (Animal animal : (List<Animal>) cleansingCenter.getStoredAnimals()) {
            animal.setCleansed(true);
        }

    }

    void adopt(String adoptionCenterName) {

    }

    void printStatistics() {

    }

    private Center findAdoptionCenterByName(String adoptionCenterName) {
        for (Center adoptionCenter : adoptionCenterList) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                return adoptionCenter;
            }
        }

        return null;
    }

    private Center findCleansingCenterByName(String cleansingCenterName) {
        for (Center cleansingCenter : cleansingCenterList) {
            if (cleansingCenter.getName().equals(cleansingCenterName)) {
                return cleansingCenter;
            }
        }

        return null;
    }

}

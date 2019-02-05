package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.animal.Animal;
import com.musala.javacourse181112.pawinc.animal.Cat;
import com.musala.javacourse181112.pawinc.animal.CleansingStatus;
import com.musala.javacourse181112.pawinc.animal.Dog;
import com.musala.javacourse181112.pawinc.center.AdoptionCenter;
import com.musala.javacourse181112.pawinc.center.Center;
import com.musala.javacourse181112.pawinc.center.CleansingCenter;

class AnimalCenterManager {
    void registerCleansingCenter(String name) {
        // Registers a Cleansing center with the given name
        Center cleansingCenter = new CleansingCenter();
        cleansingCenter.setName(name);
    }

    void registerAdoptionCenter(String name) {
        //Registers an Adoption center with the given name
        Center adoptionCenter = new AdoptionCenter();
        adoptionCenter.setName(name);
    }

    void registerDog(String name,
                     int age,
                     int learnedCommands,
                     String adoptionCenterName) {
        /*
        *   Registers a dog with the given name,
        *   age and amount of learned commands in the given Adoption center.
        */

        Animal dog = new Dog(name, age, learnedCommands);
        dog.setName(name);
        dog.setAge(age);
        ((Dog) dog).setAmountOfCommands(learnedCommands);
        //TODO: initialize the Adoption center also in here and add to it's list
    }

    void registerCat(String name,
                     int age,
                     int intelligenceCoefficient,
                     String adoptionCenterName) {

        Animal cat = new Cat(name, age, intelligenceCoefficient);
        cat.setName(name);
        cat.setAge(age);
        ((Cat) cat).setIntelligenceCoefficient(intelligenceCoefficient);
        cat.setAdoptionCenter(adoptionCenterName);
        //TODO: initialize the Adoption center also in here and add to it's list
    }

    void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        /*
         *  Sends all UNCLEANSED animals from the given Adoption center
         *  to the given Cleansing center
        */
        if (cleansingStatus = CleansingStatus.UNCLEANSED) {
            //TODO: read from the Animal list of the given center
        }
    }

    void cleanse(String cleansingCenterName) {

    }

    void adopt(String adoptionCenterName) {

    }

    void printStatistics() {

    }

}

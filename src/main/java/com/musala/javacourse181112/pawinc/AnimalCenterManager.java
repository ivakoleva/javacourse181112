package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.Animal.Animal;
import com.musala.javacourse181112.pawinc.Animal.Cat;
import com.musala.javacourse181112.pawinc.Animal.Dog;
import com.musala.javacourse181112.pawinc.Center.AdoptionCenter;
import com.musala.javacourse181112.pawinc.Center.CleansingCenter;

import java.util.ArrayList;
import java.util.List;

public class AnimalCenterManager {

    private static String errorMsgNoAdoptionCenter = "Adoption Center not found.";
    private static String errorMsgNoCleansingCenter = "Cleansing Center not found.";

    public static List<Animal> cleansedAnimalsList = new ArrayList<>();
    public static List<Animal> adoptedAnimalsList = new ArrayList<>();
    public static List<Cat> catsList = new ArrayList<>();
    public static List<Dog> dogsList = new ArrayList<>();
    public static List<CleansingCenter> cleansingCentersList = new ArrayList<>();
    public static List<AdoptionCenter> adoptionCentersList = new ArrayList<>();

    private Animal getCleansedAnimals(String name) {
        for (Animal getCleansedAnimals : cleansedAnimalsList) {
            if (getCleansedAnimals.getName().equals(name)) {
                return getCleansedAnimals;
            }
        }
        return null;
    }

    private Animal getAdoptedAnimals(String name) {
        for (Animal getAdoptedAnimals : adoptedAnimalsList) {
            if (getAdoptedAnimals.getName().equals(name)) {
                return getAdoptedAnimals;
            }
        }
        return null;
    }

    private Cat getCats(String name) {
        for (Cat getCats : catsList) {
            if (getCats.getName().equals(name)) {
                return getCats;
            }
        }
        return null;
    }

    private Dog getDogs(String name) {
        for (Dog getDogs : dogsList) {
            if (getDogs.getName().equals(name)) {
                return getDogs;
            }
        }
        return null;
    }

    private static CleansingCenter getCleansingCenter(String name) {
        for (CleansingCenter cleansingCenter : cleansingCentersList) {
            if (cleansingCenter.getName().equals(name)) {
                return cleansingCenter;
            }
        }
        return null;
    }

    private static AdoptionCenter getAdoptionCenter(String name) {
        for (AdoptionCenter adoptionCenter : adoptionCentersList) {
            if (adoptionCenter.getName().equals(name)) {
                return adoptionCenter;
            }
        }
        return null;
    }

    static void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        cleansingCentersList.add(cleansingCenter);
    }

    static void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        adoptionCentersList.add(adoptionCenter);
    }

    static void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        Dog dog = new Dog(name, age, learnedCommands);
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);

        if (adoptionCenter == null) {
            System.out.println(errorMsgNoAdoptionCenter);
        } else {
            adoptionCenter.addAnimal(dog);
            dogsList.add(dog);
        }
    }

    static void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Cat cat = new Cat(name, age, intelligenceCoefficient);
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);

        if (adoptionCenter == null) {
            System.out.println(errorMsgNoAdoptionCenter);
        } else {
            adoptionCenter.addAnimal(cat);
            catsList.add(cat);
        }
    }

    static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);
        CleansingCenter cleansingCenter = getCleansingCenter(cleansingCenterName);
        if (adoptionCenter == null || cleansingCenter == null) {
            System.out.println(errorMsgNoAdoptionCenter);
        } else {
            adoptionCenter.cleanseAnimals(cleansingCenter);

        }
    }

    static final void cleanse(String cleansingCenterName) {
        CleansingCenter cleansingCenter = getCleansingCenter(cleansingCenterName);
        if (cleansingCenter == null) {
            System.out.println(errorMsgNoCleansingCenter);
        } else {
            cleansingCenter.cleanse();
        }
    }

    static void adopt(String adoptionCenterName) {
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);

        if (adoptionCenter == null) {
            System.out.println(errorMsgNoAdoptionCenter);
        } else {
            adoptionCenter.adoptAnimals();
        }
    }

    public void printStatistics() {
        //System.out.println(adoptionCentersList.toString());
        // System.out.println(cleansingCentersList.toString());
        StringBuilder builder = new StringBuilder();

        builder.append("Paw Incorporative Regular Statistics\n");
        //builder.append(String.format("Castration Centers: %d\n",this.castrationCentersList.size()));
        builder.append(String.format("Adoption Centers: %d\n", this.adoptionCentersList.size()));
        builder.append(String.format("Cleansing Centers: %d\n", this.cleansingCentersList.size()));
        builder.append(String.format("Adopted Animals: %s\n", adoptedAnimalsList.size()));
        builder.append(String.format("Cleansed Animals: %s\n", cleansedAnimalsList.size()));
        //builder.append(String.format("Animals Awaiting Adoption: %d\n", awaitingAdoption()));
        //builder.append(String.format("Animals Awaiting Cleansing: %d\n", awaitingCleansing()));

        System.out.println(builder.toString());
    }

    /*private int awaitingCleansing() {
        int awaitingCleansing = 0;
        for (CleansingCenter cleansingCenter : cleansingCentersList) {
            for (Animal animal : cleansingCenter.getStoredAnimals()) {
                adoptedAnimalsList.add(animal.getName());
            }
        }
        return awaitingCleansing;
    }
    private int awaitingAdoption() {
        int awaitingCleansing = 0;
        for (CleansingCenter cleansingCenter : cleansingCentersList) {
            for (Animal animal : cleansingCenter.getStoredAnimals()) {
                adoptedAnimalsList.add(animal.getName());
            }
        }
        return awaitingAdoption();
    }*/

    public static void main(String[] args) {
        AnimalCenterManager animalCenterManager = new AnimalCenterManager();

        animalCenterManager.registerAdoptionCenter("AdoptABuddy");
        animalCenterManager.registerAdoptionCenter("New Home");
        animalCenterManager.registerCleansingCenter("CleansingFriends");
        animalCenterManager.registerDog("Jakie", 2, 3, "AdoptABuddy");
        animalCenterManager.registerDog("Shaggy", 3, 5, "AdoptABuddy");
        animalCenterManager.registerCat("Puffie", 6, 77, "AdoptABuddy");
        animalCenterManager.registerCat("Ego", 1, 15, "New Home");
        animalCenterManager.sendForCleansing("AdoptABuddy", "CleansingFriends");
        animalCenterManager.cleanse("CleansingFriends");
        animalCenterManager.adopt("AdoptABuddy");

        animalCenterManager.printStatistics();
    }
}
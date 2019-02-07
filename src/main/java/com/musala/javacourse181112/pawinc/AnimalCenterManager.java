package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.animals.Animal;
import com.musala.javacourse181112.pawinc.animals.Cat;
import com.musala.javacourse181112.pawinc.animals.Dog;
import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;
import com.musala.javacourse181112.pawinc.centers.CleansingCenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalCenterManager {

    static private final List<AdoptionCenter> adoptionCenters = new ArrayList<>();
    static private final List<CleansingCenter> cleansingCenters = new ArrayList<>();
    private static final List<String> allAnimalsAdopted = new ArrayList<>();
    private static final List<String> allAnimalsCleansed = new ArrayList<>();

    public static List<AdoptionCenter> getAdoptionCenters() {
        return adoptionCenters;
    }

    public static List<CleansingCenter> getCleansingCenters() {
        return cleansingCenters;
    }

    static void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        cleansingCenters.add(cleansingCenter);
    }

    static void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        adoptionCenters.add(adoptionCenter);
    }

    static void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        Dog dog = new Dog(name, age, adoptionCenterName, learnedCommands);

        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenterName.equals(adoptionCenter.getName())) {
                adoptionCenter.getStoredAnimals().add(dog);
            }
        }
    }

    static void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Cat cat = new Cat(name, age, adoptionCenterName, intelligenceCoefficient);
        for (AdoptionCenter center : adoptionCenters) {
            if (center.getName().equals(adoptionCenterName)) {
                center.getStoredAnimals().add(cat);
            }
        }
    }

    static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.sendAnimalsForCleansing(cleansingCenterName);
            }
        }
    }

    static void cleanse(String cleansingCenterName) {
        for (CleansingCenter cleansingCenter : cleansingCenters) {
            if (cleansingCenter.getName().equals(cleansingCenterName)) {
                cleansingCenter.cleanseAnimals();
            }
        }
    }

    static void adopt(String adoptionCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.adoptAnimals();
            }
        }
    }

    static void printStatics() {
        int animalsAwaitingAdoption = 0;
        int animalsAwaitingCleansing = 0;

        for (AdoptionCenter adoptionCenter : adoptionCenters) {

            for (Animal animal : adoptionCenter.getAdoptedAnimals()) {
                allAnimalsAdopted.add(animal.getName());
            }
        }
        allAnimalsCleansed.addAll(allAnimalsAdopted);

        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            for (Animal animal : adoptionCenter.getStoredAnimals()) {
                if (animal.getCleansingStatus().equals(CleansingStatus.CLEANSED)) {
                    allAnimalsCleansed.add(animal.getName());
                    animalsAwaitingAdoption++;
                }
            }
        }
        for(CleansingCenter cleansingCenter:cleansingCenters){
            for(Animal animal:cleansingCenter.getStoredAnimals()){
                if(animal.getCleansingStatus().equals(CleansingStatus.NOT_CLEANSED)){
                    animalsAwaitingCleansing++;
                }
            }
        }
        Collections.sort(allAnimalsCleansed);
        Collections.sort(allAnimalsAdopted);


        System.out.print("Paw Incorporative Regular Statistics\n" +
                "  Adoption Centers: " + adoptionCenters.size() + "\n" +
                "  Cleansing Centers: " + cleansingCenters.size() + "\n");

        if (!allAnimalsAdopted.isEmpty()) {
            System.out.print("  Adopted Animals: " +
                    String.join(",", allAnimalsAdopted) + "\n");
        } else
            System.out.print("  Adopted Animals: None");

        if (!allAnimalsCleansed.isEmpty()) {
            System.out.print("  Adopted Animals: "
                    + String.join(",", allAnimalsCleansed) + "\n");
        } else
            System.out.print("  Cleansed Animals: None");
        System.out.print("  Animals Awaiting Adoption:" + animalsAwaitingAdoption + "\n" +
                "  Animals Awaiting Cleansing: " + animalsAwaitingCleansing);

        allAnimalsAdopted.clear();
        allAnimalsCleansed.clear();
        System.exit(0);
    }
}



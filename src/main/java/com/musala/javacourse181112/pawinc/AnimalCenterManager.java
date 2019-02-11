package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.animals.Animal;
import com.musala.javacourse181112.pawinc.animals.Cat;
import com.musala.javacourse181112.pawinc.animals.Dog;
import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;
import com.musala.javacourse181112.pawinc.centers.CastrationCenter;
import com.musala.javacourse181112.pawinc.centers.CleansingCenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalCenterManager {

    static private final List<AdoptionCenter> adoptionCenters = new ArrayList<>();
    static private final List<CleansingCenter> cleansingCenters = new ArrayList<>();
    static private final List<CastrationCenter> castrationCenters = new ArrayList<>();
    private static final List<String> allAnimalsAdopted = new ArrayList<>();
    private static final List<String> allAnimalsCleansed = new ArrayList<>();
    private static final List<String> allAnimalsCastrated = new ArrayList<>();
    static private int animalsAwaitingAdoption = 0;
    static private int animalsAwaitingCleansing = 0;

    public static List<AdoptionCenter> getAdoptionCenters() {
        return adoptionCenters;
    }

    public static List<CleansingCenter> getCleansingCenters() {
        return cleansingCenters;
    }

    public static List<CastrationCenter> getCastrationCenters() {
        return castrationCenters;
    }

    static void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        cleansingCenters.add(cleansingCenter);
    }

    static void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        adoptionCenters.add(adoptionCenter);
    }

    static void registerCastrationCenter(String name) {
        CastrationCenter castrationCenter = new CastrationCenter(name);
        castrationCenters.add(castrationCenter);
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

    static void sendForCastration(String adoptionCenterName, String castrationCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName))
                adoptionCenter.sendAnimalsForCastration(castrationCenterName);
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

    static void castrate(String castrationCenterName) {
        for (CastrationCenter castrationCenter : castrationCenters) {
            if (castrationCenter.getName().equals(castrationCenterName)) {
                castrationCenter.castrateAnimals();
            }
        }
    }

    static void printStatics() {
        searchAdoptionCenterAdoptedAnimals();
        searchAdoptionCenterStoredAnimals();
        searchCleansingCenterStoredAnimals();
        allAnimalsCleansed.addAll(allAnimalsAdopted);
        sortLists();

        System.out.println("Paw Inc. Regular Castration Statistics\n" +
                "Castration Centers: " + castrationCenters.size());
        if (!allAnimalsCastrated.isEmpty())
            System.out.println("Castrated Animals: " +
                    String.join(", ", allAnimalsCastrated));
        else
            System.out.print("Castrated Animals: None \n");

        System.out.print("Paw Incorporative Regular Statistics\n" +
                "Adoption Centers: " + adoptionCenters.size() + "\n" +
                "Cleansing Centers: " + cleansingCenters.size() + "\n");

        if (!allAnimalsAdopted.isEmpty()) {
            System.out.print("Adopted Animals: " +
                    String.join(", ", allAnimalsAdopted) + "\n");
        } else
            System.out.print("Adopted Animals: None \n");

        if (!allAnimalsCleansed.isEmpty()) {
            System.out.print("Cleansed Animals: "
                    + String.join(", ", allAnimalsCleansed) + "\n");
        } else
            System.out.print("Cleansed Animals: None \n");
        System.out.print("Animals Awaiting Adoption: " + animalsAwaitingAdoption + "\n" +
                "Animals Awaiting Cleansing: " + animalsAwaitingCleansing);
        System.out.println();
        System.out.println();
        allAnimalsAdopted.clear();
        allAnimalsCleansed.clear();
    }

    static private void searchAdoptionCenterAdoptedAnimals() {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            for (Animal animal : adoptionCenter.getAdoptedAnimals()) {
                allAnimalsAdopted.add(animal.getName());
                if (animal.getCastrationStatus().equals(CastrationStatus.CASTRATED)) {
                    allAnimalsCastrated.add(animal.getName());
                }
            }
        }

    }

    static private void searchAdoptionCenterStoredAnimals() {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            for (Animal animal : adoptionCenter.getStoredAnimals()) {
                if (animal.getCleansingStatus().equals(CleansingStatus.CLEANSED)) {
                    allAnimalsCleansed.add(animal.getName());
                    animalsAwaitingAdoption++;
                }
                if (animal.getCastrationStatus().equals(CastrationStatus.CASTRATED))
                    allAnimalsCastrated.add(animal.getName());
            }
        }

    }

    static private void searchCleansingCenterStoredAnimals() {
        for (CleansingCenter cleansingCenter : cleansingCenters) {
            for (Animal animal : cleansingCenter.getStoredAnimals()) {
                if (animal.getCleansingStatus().equals(CleansingStatus.NOT_CLEANSED)) {
                    animalsAwaitingCleansing++;
                }
                if (animal.getCastrationStatus().equals(CastrationStatus.CASTRATED)) {
                    allAnimalsCastrated.add(animal.getName());
                }
            }
        }
    }

    static private void sortLists() {
        Collections.sort(allAnimalsCleansed);
        Collections.sort(allAnimalsAdopted);
        Collections.sort(allAnimalsCastrated);
    }
}



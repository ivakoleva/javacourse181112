package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.animals.Animal;
import com.musala.javacourse181112.paw_inc.animals.Cat;
import com.musala.javacourse181112.paw_inc.animals.Dog;
import com.musala.javacourse181112.paw_inc.centers.AdoptionCenter;
import com.musala.javacourse181112.paw_inc.centers.CastrationCenter;
import com.musala.javacourse181112.paw_inc.centers.CleansingCenter;
import com.musala.javacourse181112.paw_inc.enums.CleansingAndAdoptionStatus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalCenterManager {
    private static AnimalCenterManager singleInstance;
    private final List<AdoptionCenter> adoptionCenters = new ArrayList<>();
    private final List<CleansingCenter> cleansingCenters = new ArrayList<>();
    private final List<CastrationCenter> castrationCenters = new ArrayList<>();


    private AnimalCenterManager() {
    }

    public static AnimalCenterManager getInstance() {
        if (singleInstance == null) {
            singleInstance = new AnimalCenterManager();
        }
        return singleInstance;
    }

    public List<AdoptionCenter> getAdoptionCenters() {
        return adoptionCenters;
    }

    public List<CleansingCenter> getCleansingCenters() {
        return cleansingCenters;
    }

    public List<CastrationCenter> getCastrationCenters() {
        return castrationCenters;
    }

    public void registerCleansingCenter(String name) {
        cleansingCenters.add(new CleansingCenter(name));
    }

    public void registerAdoptionCenter(String name) {
        adoptionCenters.add(new AdoptionCenter(name));
    }

    public void registerCastrationCenter(String name) {
        castrationCenters.add(new CastrationCenter(name));
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.getAnimalList().add(new Dog(name, age, adoptionCenterName, learnedCommands));
            }

        }
    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.getAnimalList().add(new Cat(name, age, adoptionCenterName, intelligenceCoefficient));
            }

        }
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.sendAllForCleanse(cleansingCenterName);
            }
        }
    }

    public void sendForCastration(String adoptionCenterName, String castrationCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.sendAllForCastration(castrationCenterName);
            }
        }

    }

    public void cleanse(String cleansingCenterName) {
        for (CleansingCenter cleansingCenter : cleansingCenters) {
            if (cleansingCenter.getName().equals(cleansingCenterName)) {
                cleansingCenter.cleanseAll();
            }
        }
    }

    public void castrate(String castrationCenterName) {

        for (CastrationCenter castrationCenter : castrationCenters) {
            if (castrationCenter.getName().equals(castrationCenterName)) {
                castrationCenter.castrateAll();
            }
        }
    }

    public void adopt(String adoptionCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.adoptAll();
            }
        }
    }

    public void castrationStatistics() {
        System.out.println("Paw Inc. Regular Castration Statistics");
        System.out.println("Castration Centers: " + castrationCenters.size());
        System.out.print("Castrated Animals: ");
        final List<Animal> tempAnimalList = new ArrayList<>();

        for(CastrationCenter castrationCenter:castrationCenters){
            tempAnimalList.addAll(castrationCenter.getCastratedAnimals());
        }

        printList(tempAnimalList);
        System.out.println();

    }


    public void printStatistics() {
        System.out.println("Paw Incorporated Regular Statistics");
        System.out.println("Adoption Centers: " + adoptionCenters.size());
        System.out.println("Cleansing Centers: " + cleansingCenters.size());
        System.out.print("Adopted Animals: ");
        final List<Animal> tempAnimalList = new ArrayList<>();
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            tempAnimalList.addAll(adoptionCenter.getAdoptionList());


        }
        printList(tempAnimalList);
        System.out.print("Cleansed Animals: ");

        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            tempAnimalList.addAll(adoptionCenter.getAdoptionList());
            for (Animal animal : adoptionCenter.getAnimalList()) {
                if (animal.getCleansingAndAdoptionStatus().equals(CleansingAndAdoptionStatus.CLEANSED)) {
                    tempAnimalList.add(animal);
                }
            }
        }

        printList(tempAnimalList);
        System.out.print("Animals Awaiting Adoption: ");
        int animalsAwaitingAdoption = 0;
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            for (Animal animal : adoptionCenter.getAnimalList()) {

                if (animal.getCleansingAndAdoptionStatus().equals(CleansingAndAdoptionStatus.CLEANSED)) {
                    animalsAwaitingAdoption++;
                }
            }
        }
        System.out.println(animalsAwaitingAdoption);


        System.out.print("Animals Awaiting Cleansing: ");
        int animalsAwaitingCleansing = 0;
        for (CleansingCenter cleansingCenter : cleansingCenters) {
            animalsAwaitingCleansing += cleansingCenter.getAnimalList().size();
        }
        System.out.println(animalsAwaitingCleansing);
        System.out.println();
        System.out.println("Memory Usage: "+ (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024/1024 +" MB");
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - Aplication.startTime) + " MS");
        System.exit(0);
    }

    private void printList(List<Animal> tempAnimalList) {
        tempAnimalList.sort(Comparator.comparing(Animal::getName));
        if (tempAnimalList.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(tempAnimalList
                    .stream()
                    .map(Animal::toString)
                    .collect(Collectors.joining(", ")));

        }
        tempAnimalList.clear();

    }



}

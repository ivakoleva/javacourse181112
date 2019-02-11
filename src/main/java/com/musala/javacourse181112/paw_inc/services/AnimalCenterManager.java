package com.musala.javacourse181112.paw_inc.services;

import com.musala.javacourse181112.paw_inc.model.*;

import java.util.*;
import java.util.stream.Collectors;

class AnimalCenterManager {
    private final static Map<CenterType, Set<Center>> CENTERS = new EnumMap<>(CenterType.class);
    private final static List<Animal> ADOPTED_ANIMALS = new ArrayList<>();
    private final static List<Animal> CLEANSED_ANIMALS = new ArrayList<>();

    void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter();
        cleansingCenter.setName(name);
        cleansingCenter.setAnimalList(new ArrayList<>());
        CENTERS.get(CenterType.CLEANSING_CENTER).add(cleansingCenter);
    }

    void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter();
        adoptionCenter.setName(name);
        adoptionCenter.setAnimalList(new ArrayList<>());
        CENTERS.get(CenterType.ADOPTION_CENTER).add(adoptionCenter);
    }

    void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);
        Dog dog = new Dog(name, age, learnedCommands);
        adoptionCenter.getAnimalList().add(dog);
    }

    void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);
        Cat cat = new Cat(name, age, intelligenceCoefficient);
        adoptionCenter.getAnimalList().add(cat);
    }

    void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);
        CleansingCenter cleansingCenter = getCleansingCenter(cleansingCenterName);

        adoptionCenter.getAnimalList().stream()
                .filter(Animal::isCleansed)
                .collect(Collectors.toCollection(cleansingCenter::getAnimalList))
                .forEach(i -> i.getAdoptionCenter().getAnimalList().remove(i));
    }

    void cleanse(String cleansingCenterName) {
        CleansingCenter cleansingCenter = getCleansingCenter(cleansingCenterName);

        cleansingCenter.getAnimalList().stream()
                .forEach(i -> {
                    i.setCleansed(true);
                    CLEANSED_ANIMALS.add(i);
                    i.getAdoptionCenter().getAnimalList().add(i);
                    i.getCleansingCenter().getAnimalList().remove(i);
                });
    }

    void adopt(String adoptionCenterName) {
        AdoptionCenter adoptionCenter = getAdoptionCenter(adoptionCenterName);

        adoptionCenter.getAnimalList().stream()
                .filter(i -> !i.isCleansed())
                .forEach(i -> {
                    ADOPTED_ANIMALS.add(i);
                    i.getAdoptionCenter().getAnimalList().remove(i);
                });
    }

    void printStatistics() throws NoSuchFieldException {
        System.out.println("Paw Incorporative Regular Statistics");
        System.out.println("Adoption Centers: " + CENTERS.get(CenterType.ADOPTION_CENTER).size());
        System.out.println("Cleansing Centers: " + CENTERS.get(CenterType.CLEANSING_CENTER).size());

        ADOPTED_ANIMALS.sort(Comparator.comparing(Animal::getName));
        System.out.println("Adopted animals: " + ADOPTED_ANIMALS);

        CLEANSED_ANIMALS.sort(Comparator.comparing(Animal::getName));
        System.out.println("Cleansed animals: " + CLEANSED_ANIMALS);

        List<Animal> animalsAwaitingAdoption = CENTERS.get(CenterType.ADOPTION_CENTER).stream()
                .flatMap(center -> center.getAnimalList().stream())
                .filter(animal -> !animal.isCleansed())
                .collect(Collectors.toList());
        System.out.println("Animals awaiting adoption: " +  animalsAwaitingAdoption.size());

        List<Animal> animalsAwaitingCleansing = CENTERS.get(CenterType.CLEANSING_CENTER).stream()
                .flatMap(center -> center.getAnimalList().stream())
                .filter(animal -> animal.isCleansed())
                .collect(Collectors.toList());
        System.out.println("Animals Awaiting Cleansing: " + animalsAwaitingCleansing.size());
    }

    private AdoptionCenter getAdoptionCenter(String adoptionCenterName) {
        return (AdoptionCenter) CENTERS.get(CenterType.ADOPTION_CENTER).stream()
                .filter(center -> adoptionCenterName.equals(center.getName()))
                .findFirst()
                .orElse(null);
    }

    private CleansingCenter getCleansingCenter(String cleansingCenterName) {
        return (CleansingCenter) CENTERS.get(CenterType.CLEANSING_CENTER).stream()
                .filter(center -> cleansingCenterName.equals(center.getName()))
                .findFirst()
                .orElse(null);
    }
}

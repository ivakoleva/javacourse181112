package com.musala.javacourse181112.ProjectPetko;

import java.util.*;

public class AnimalCenterManager {
    private Map<String, AdoptionCenter> adoptionCenters;
    private Map<String, CleansingCenter> cleansingCenters;
    private Map<String, CastrationCenter> castrationCenters;
    private static Set<Animal> adoptedAnimals;
    private static Set<Animal> cleansedAnimals;
    private static Set<Animal> castratedAnimals;

    public AnimalCenterManager() {
        adoptionCenters = new HashMap<>();
        cleansingCenters = new HashMap<>();
        castrationCenters = new HashMap<>();
        adoptedAnimals = new TreeSet<>();
        cleansedAnimals = new TreeSet<>();
        castratedAnimals = new TreeSet<>();
    }

    public void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        adoptionCenters.put(name, adoptionCenter);
    }

    public void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        cleansingCenters.put(name, cleansingCenter);
    }

    public void registerCastrationCenter(String name) {
        CastrationCenter castrationCenter = new CastrationCenter(name);
        castrationCenters.put(name, castrationCenter);
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        Dog dog = new Dog(name, age, learnedCommands);

        AdoptionCenter adoptionCenter = adoptionCenters.get(adoptionCenterName);
        Set<Animal> animals = adoptionCenter.getStoredAnimals();
        animals.add(dog);
    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Cat cat = new Cat(name, age, intelligenceCoefficient);

        AdoptionCenter adoptionCenter = adoptionCenters.get(adoptionCenterName);
        Set<Animal> animals = adoptionCenter.getStoredAnimals();
        animals.add(cat);
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        AdoptionCenter adoptionCenter = adoptionCenters.get(adoptionCenterName);
        CleansingCenter cleansingCenter = cleansingCenters.get(cleansingCenterName);

        adoptionCenter.sendForCleansing(cleansingCenter);
    }

    public void sendForCastration(String adoptionCenterName, String castrationCenterName) {
        AdoptionCenter adoptionCenter = adoptionCenters.get(adoptionCenterName);
        CastrationCenter castrationCenter = castrationCenters.get(castrationCenterName);

        adoptionCenter.sendForCastration(castrationCenter);
    }

    public void cleanse(String cleansingCenterName) {
        CleansingCenter cleansingCenter = cleansingCenters.get(cleansingCenterName);
        cleansedAnimals.addAll(cleansingCenter.cleanse());
    }

    public void castrate(String castrationCenterName) {
        CastrationCenter castrationCenter = castrationCenters.get(castrationCenterName);
        castratedAnimals.addAll(castrationCenter.castrate());
    }

    void adopt(String adoptionCenterName) {
        AdoptionCenter adoptionCenter = adoptionCenters.get(adoptionCenterName);
        adoptedAnimals.addAll(adoptionCenter.adopt());
    }

    public void printRegularStatistics() {
        String numberOfAdoptionCenters = "Adoption Centers: " + adoptionCenters.size() + "\n";
        String numberOfCleansingCenters = "Cleansing Centers: " + cleansingCenters.size() + "\n";

        StringBuilder adoptedAnimalsBuilder = new StringBuilder();
        adoptedAnimalsBuilder.append("Adopted Animals: ");
        addStatisticsForAdoptedAnimals(adoptedAnimalsBuilder, adoptedAnimals);
        adoptedAnimalsBuilder.append("\n");
        String numberOfAdoptedAnimals = adoptedAnimalsBuilder.toString();

        StringBuilder cleansedAnimalsBuilder = new StringBuilder();
        cleansedAnimalsBuilder.append("Cleansed Animals: ");
        addStatisticsForCleansedAnimals(cleansedAnimalsBuilder, cleansedAnimals);
        cleansedAnimalsBuilder.append("\n");
        String numberOfCleansedAnimals = cleansedAnimalsBuilder.toString();

        String numberOfAnimalsAwaitingAdoption =
                "Animals Awaiting Adoption: " + calculateAmountOfAnimalsWaitingForAdoption() + "\n";

        String numberOfAnimalsAwaitingCleansing =
                "Animals Awaiting Cleansing: " + calculateAmountOfAnimalsWaitingForCleansing() + "\n";

        String output = "Paw Incorporative Regular Statistics\n" +
                numberOfAdoptionCenters +
                numberOfCleansingCenters +
                numberOfAdoptedAnimals +
                numberOfCleansedAnimals +
                numberOfAnimalsAwaitingAdoption +
                numberOfAnimalsAwaitingCleansing;

        System.out.println(output);
    }

    public void printCastrationStatistics() {
        String numberOfCastrationCenters = "Castration Centers: " + castrationCenters.size() + "\n";

        StringBuilder castratedAnimalsBuilder = new StringBuilder();
        castratedAnimalsBuilder.append("Castrated Animals: ");
        addStatisticsForCastratedAnimals(castratedAnimalsBuilder, castratedAnimals);
        castratedAnimalsBuilder.append("\n");
        String numberOfCastratedAnimals = castratedAnimalsBuilder.toString();

        String castrationOutput = "Paw Inc. Regular Castration Statistics\n" +
                numberOfCastrationCenters +
                numberOfCastratedAnimals;

        System.out.println(castrationOutput);
        printRegularStatistics();
    }

    private void addStatisticsForAdoptedAnimals(StringBuilder builder, Set<Animal> animals) {
        if(animals.isEmpty()) {
            builder.append("None");
        } else {
            for(Animal a : adoptedAnimals) {
                builder.append(a.getName()).append(", ");
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private void addStatisticsForCleansedAnimals(StringBuilder builder, Set<Animal> animals) {
        if(animals.isEmpty()) {
            builder.append("None");
        } else {
            for(Animal a : cleansedAnimals) {
                builder.append(a.getName()).append(", ");
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private void addStatisticsForCastratedAnimals(StringBuilder builder, Set<Animal> animals) {
        if(animals.isEmpty()) {
            builder.append("None");
        } else {
            for(Animal a : castratedAnimals) {
                builder.append(a.getName()).append(", ");
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private int calculateAmountOfAnimalsWaitingForAdoption() {
        int result = 0;
        for (AdoptionCenter adoptionCenter : adoptionCenters.values()) {
            for (Animal a : adoptionCenter.getStoredAnimals()) {
                if (a.getCleansingStatus() == true) {
                    result++;
                }
            }
        }

        return result;
    }

    private int calculateAmountOfAnimalsWaitingForCleansing() {
        int result = 0;
        for (CleansingCenter cleansingCenter : cleansingCenters.values()) {
            result += cleansingCenter.getStoredAnimals().size();
        }

        return result;
    }
}

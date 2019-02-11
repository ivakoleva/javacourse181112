package com.musala.javacourse181112.pawinc;

import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalCenterManager {

    private HashMap<String, AdoptionCenter> adoptionCenters;
    private HashMap<String, CleansingCenter> cleansingCenters;
    private HashMap<String, CastrationCenter> castrationCenters;
    private List<Animal> cleansedAnimals;
    private List<Animal> adoptedAniamls;
    private List<Animal> castratedAnimals;

    public AnimalCenterManager() {
        this.adoptionCenters = new HashMap<>();
        this.cleansingCenters = new HashMap<>();
        this.castrationCenters = new HashMap<>();
        this.cleansedAnimals = new ArrayList<>();
        this.adoptedAniamls = new ArrayList<>();
        this.castratedAnimals = new ArrayList<>();
    }

    public void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        this.cleansingCenters.putIfAbsent(name, cleansingCenter);
    }

    public void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        this.adoptionCenters.putIfAbsent(name, adoptionCenter);
    }

    public void registerCastrationCenter(String name) {
        CastrationCenter castrationCenter = new CastrationCenter(name);
        this.castrationCenters.putIfAbsent(name, castrationCenter);
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        Dog dog = new Dog(name, age, adoptionCenterName, learnedCommands);
        this.adoptionCenters.get(adoptionCenterName).register(dog);
    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Cat cat = new Cat(name, age, adoptionCenterName, intelligenceCoefficient);
        this.adoptionCenters.get(adoptionCenterName).register(cat);
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName)  {
        CleansingCenter cleansingCenter = this.cleansingCenters.get(cleansingCenterName);
        this.adoptionCenters.get(adoptionCenterName).sendForCleansing(cleansingCenter);
    }

    public void sendForCastration(String adoptionCenterName, String castrationCenterName)  {
        CastrationCenter castrationCenter = this.castrationCenters.get(castrationCenterName);
        this.adoptionCenters.get(adoptionCenterName).sendForCastration(castrationCenter);
    }

    public void cleanse(String cleansingCenterName) {
        List<Animal> cleansedAnimals =
                this.cleansingCenters.get(cleansingCenterName).cleanse();

        for (Animal cleansedAnimal : cleansedAnimals) {
            this.adoptionCenters.get(cleansedAnimal.getCenterName()).register(cleansedAnimal);
        }

        this.cleansedAnimals.addAll(cleansedAnimals);
    }

    public void castrate(String castrationCenterName) {
        List<Animal> castratedAnimals =
                this.castrationCenters.get(castrationCenterName).castrate();

        for (Animal castratedAnimal : castratedAnimals) {
            this.adoptionCenters.get(castratedAnimal.getCenterName()).register(castratedAnimal);
        }

        this.castratedAnimals.addAll(castratedAnimals);
    }

    public void adopt(String adoptionCenterName) {
        List<Animal> adoptedAnimals =
                this.adoptionCenters.get(adoptionCenterName).adopt();

        this.adoptedAniamls.addAll(adoptedAnimals);
    }

    public void printStatistics() {
        StringBuilder builder = new StringBuilder();

        builder.append("Paw Incorporative Regular Statistics\n");
        builder.append(String.format("Adoption Centers: %d\n", this.adoptionCenters.size()));
        builder.append(String.format("Cleansing Centers: %d\n", this.cleansingCenters.size()));
        builder.append(String.format("Adopted Animals: %s\n", getSortedAnimals(this.adoptedAniamls)));
        builder.append(String.format("Cleansed Animals: %s\n", getSortedAnimals(this.cleansedAnimals)));
        builder.append(String.format("Animals Awaiting Adoption: %d\n", getAwaitingAdoptionCount()));
        builder.append(String.format("Animals Awaiting Cleansing: %d\n", getAwaitingCleansingCount()));

        System.out.println(builder.toString());
    }

    public void printCastrationStatistics() {
        StringBuilder builder = new StringBuilder();
        builder.append("Paw Inc. Regular Castration Statistics\n");
        builder.append(String.format("Castration Centers: %d\n", this.castrationCenters.size()));
        builder.append(String.format("Castrated Animals: %s", getSortedAnimals(this.castratedAnimals)));
        System.out.println(builder.toString());
    }

    private int getAwaitingCleansingCount() {
        int count = this.cleansingCenters.values().stream()
                .flatMap(c -> c.getAnimals().stream())
                .collect(Collectors.toList())
                .size();

        return count;
    }

    private int getAwaitingAdoptionCount() {
        int count = this.adoptionCenters.values().stream()
                .flatMap(c -> c.getAnimals().stream())
                .filter(a -> a.isCleansed())
                .collect(Collectors.toList())
                .size();

        return count;
    }

    private String getSortedAnimals(List<Animal> animals) {
        if (animals.isEmpty()) {
            return "None";
        }

        List<String> sorted = animals.stream()
                .map(a -> a.getName())
                .sorted(Collator.getInstance())
                .collect(Collectors.toList());

        return String.join(", ", sorted);
    }

    public static void main(String[] args) {
        AnimalCenterManager acm = new AnimalCenterManager();
        acm.registerAdoptionCenter("Destiny");
        acm.registerCleansingCenter("Hope");
        acm.registerDog("Sharo", 5, 5, "Destiny");
        acm.sendForCleansing("Destiny", "Hope");
        acm.cleanse("Hope");
        acm.adopt("Destiny");
        acm.printStatistics();
    }
}

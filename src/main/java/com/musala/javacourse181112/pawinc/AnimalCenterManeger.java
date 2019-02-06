package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.animals.Animal;
import com.musala.javacourse181112.pawinc.animals.Cat;
import com.musala.javacourse181112.pawinc.animals.Dog;
import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;
import com.musala.javacourse181112.pawinc.centers.CleansingCenter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class AnimalCenterManeger {
    private static AnimalCenterManeger singleInstance;
    private List<AdoptionCenter> adoptionCenters = new ArrayList<>();
    private List<CleansingCenter> cleansingCenters = new ArrayList<>();


    private AnimalCenterManeger() {
    }

    public static AnimalCenterManeger getInstance() {
        if (singleInstance == null) {
            singleInstance = new AnimalCenterManeger();
        }
        return singleInstance;
    }

    public List<AdoptionCenter> getAdoptionCenters() {
        return adoptionCenters;
    }

    public List<CleansingCenter> getCleansingCenters() {
        return cleansingCenters;
    }

    void registerCleansingCenter(String name) {
        cleansingCenters.add(new CleansingCenter(name));
    }

    void registerAdoptionCenter(String name) {
        adoptionCenters.add(new AdoptionCenter(name));
    }

    void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.getAnimalList().add(new Dog(name, age, adoptionCenterName, learnedCommands));
            }

        }
    }

    void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        for (AdoptionCenter adoptionCenter : adoptionCenters) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter.getAnimalList().add(new Cat(name, age, adoptionCenterName, intelligenceCoefficient));
            }

        }
    }

    void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        for(AdoptionCenter adoptionCenter:adoptionCenters){
            if(adoptionCenter.getName().equals(adoptionCenterName)){
                adoptionCenter.sendAllForCleanse(cleansingCenterName);
            }
        }
    }

    void cleanse(String cleansingCenterName) {
        for(CleansingCenter cleansingCenter:cleansingCenters){
            if(cleansingCenter.getName().equals(cleansingCenterName)){
                cleansingCenter.cleanseAll();
            }
        }
    }

    void adopt(String adoptionCenterName) {
        for(AdoptionCenter adoptionCenter:adoptionCenters){
            if(adoptionCenter.getName().equals(adoptionCenterName)){
                adoptionCenter.adoptAll();
            }
        }
    }

    void printStatistics() {
        System.out.println("Paw Incorporated Regular Statistics");
        System.out.println("Adoption Centers: "+adoptionCenters.size());
        System.out.println("Cleansing Centers: "+cleansingCenters.size());
        System.out.println("Adopted Animals: ");
        for(AdoptionCenter adoptionCenter:adoptionCenters){
            adoptionCenter.getAdoptionList().sort(Comparator.comparing(Animal::getName));
            adoptionCenter.getAdoptionList().forEach(System.out::print);
        }
        System.out.println("Cleansed Animals: ");
        final List<Animal> cleansedAnimals=new ArrayList<>();
        for(AdoptionCenter adoptionCenter:adoptionCenters){
            cleansedAnimals.addAll(adoptionCenter.getAdoptionList());
            for(Animal animal:adoptionCenter.getAnimalList()){
                if(animal.getAnimalStatus().equals(AnimalStatus.CLEANSED)){
                    cleansedAnimals.add(animal);
                }
            }

        }
        cleansedAnimals.sort(Comparator.comparing(Animal::getName));
        cleansedAnimals.forEach(System.out::print);
        cleansedAnimals.clear();

        System.out.println("Animals Awaiting Adoption: ");
        int animalsAwaitingAdoption=0;
        for(AdoptionCenter adoptionCenter:adoptionCenters){
            for (Animal animal:adoptionCenter.getAnimalList()){

                if(animal.getAnimalStatus().equals(AnimalStatus.CLEANSED)){
                    animalsAwaitingAdoption++;
                }
            }
        }
        System.out.print(animalsAwaitingAdoption);


        System.out.println("Animals Awaiting Cleansing: ");
        int animalsAwaitingCleansing=0;
        for (CleansingCenter cleansingCenter:cleansingCenters){
            animalsAwaitingCleansing+=cleansingCenter.getAnimalList().size();
        }
        System.out.print(animalsAwaitingCleansing);


    }

}

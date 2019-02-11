package com.musala.javacourse181112.tasks.paw_Inc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnimalCenterManager {
    private List<Center> centerList = new ArrayList<>();
    private List<Animal> adoptedAnimals = new ArrayList<>();

    public List<Center> getCenterList() {
        return centerList;
    }

    public void setCenterList(List<Center> centerList) {
        this.centerList = centerList;
    }

    public List<Animal> getAdoptedAnimals() {
        return adoptedAnimals;
    }

    public void setAdoptedAnimals(List<Animal> adoptedAnimals) {
        this.adoptedAnimals = adoptedAnimals;
    }

    public void registerCleansingCenter(final String name) {

        CleansingCenter cleansingCenter = new CleansingCenter();
        cleansingCenter.setName(name);
        centerList.add(cleansingCenter);

    }

    public void registerAdoptionCenter(final String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter();
        adoptionCenter.setName(name);
        centerList.add(adoptionCenter);

    }

    public void registerCastrationCenter(final String name) {
        CastrationCenter castrationCenter = new CastrationCenter();
        castrationCenter.setName(name);
        centerList.add(castrationCenter);

    }

    public void registerDog(final String name, final int age, final int learnedCommands, final String adoptionCenterName) {

        AdoptionCenter adoptionCenter = null;
        Dog dog = new Dog(name, age);
        dog.setAmountOfCommands(learnedCommands);
        for (Center currentAdoptionCenter : centerList) {
            if (currentAdoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter = (AdoptionCenter) currentAdoptionCenter;
            }
        }
        dog.setInitialAdoptionCenter(adoptionCenter);
        Objects.requireNonNull(adoptionCenter).getAnimalList().add(dog);

    }

    public void registerCat(final String name, final int age, final int intelligenceCoefficient, final String adoptionCenterName) {
        AdoptionCenter adoptionCenter = null;
        Cat cat = new Cat(name, age);
        cat.setIntelligrenceCoefficient(intelligenceCoefficient);
        for (Center currentAdoptionCenter : centerList) {
            if (currentAdoptionCenter.getName().equals(adoptionCenterName)) {
                adoptionCenter = (AdoptionCenter) currentAdoptionCenter;
            }
        }
        cat.setInitialAdoptionCenter(adoptionCenter);
        Objects.requireNonNull(adoptionCenter).getAnimalList().add(cat);

    }

    public void sendForCleansing(final String adoptionCenterName, final String cleansingCenterName) {
        AdoptionCenter adoptionCenter = (AdoptionCenter) findCenter(adoptionCenterName);
        CleansingCenter cleansingCenter = (CleansingCenter) findCenter(cleansingCenterName);
        cleansingCenter.getAnimalList().addAll(adoptionCenter.sendForCleansingAnimals());
    }

    public void sendForCastration(final String adoptionCenterName, final String castratingCenterName) {
        AdoptionCenter adoptionCenter = (AdoptionCenter) findCenter(adoptionCenterName);
        CastrationCenter castrationCenter = (CastrationCenter) findCenter(castratingCenterName);
        castrationCenter.getAnimalList().addAll(adoptionCenter.sendForCastratingAnimals());
    }

    public void cleanse(final String cleansingCenterName) {
        CleansingCenter cleansingCenter = (CleansingCenter) findCenter(cleansingCenterName);
        cleansingCenter.cleanseAnimals().forEach(animal -> animal.getInitialAdoptionCenter().getAnimalList().add(animal));
    }

    public void castrate(final String castrationCenterName) {
        CastrationCenter castrationCenter = (CastrationCenter) findCenter(castrationCenterName);
        castrationCenter.castrateAnimals().forEach(animal -> animal.getInitialAdoptionCenter().getAnimalList().add(animal));
    }

    public void adopt(final String adoptionCenterName) {
        AdoptionCenter adoptionCenter = (AdoptionCenter) findCenter(adoptionCenterName);
        adoptedAnimals.addAll(adoptionCenter.adoptAnimals());
    }

    public void printStatistics() {
        System.out.println("Paw Incorporation Regular Statistics");
        System.out.println("Adoption Centers: " + centerList.stream().filter(center -> center instanceof AdoptionCenter).count());
        System.out.println("Cleansing Centers: " + centerList.stream().filter(center -> center instanceof CleansingCenter).count());
        System.out.println("Adopted animals: " + prepareAnimalListForPrint(getAdoptedAnimals()));
        System.out.println("Cleansed Animal: " + prepareAnimalListForPrint(getAllCleansedAnimalsInOrder()));
        System.out.println("Animals Awaiting Adoption: " + animalsAwaitingAdoption());
        System.out.println("Animals Awaiting Cleansing: " + animalsAwaitingCleansing());
    }

    public void castrationStatistics() {
        System.out.println();
        System.out.println("Paw Inc. Regular Castration Statistics");
        System.out.println("Castration Centers: " + centerList.stream().filter(center -> center instanceof CastrationCenter).count());
        System.out.print("Castrated Animals: " + prepareAnimalListForPrint(getAllCastratedAnimalsInOrder()));
    }

    private Center findCenter(final String centerName) {
        Center center = null;
        for (Center currentCenter : centerList) {
            if (currentCenter.getName().equals(centerName)) {
                center = currentCenter;
            }
        }
        return center;
    }

    private String prepareAnimalListForPrint(final List<Animal> animalList) {
        if (animalList == null || animalList.size() == 0) {
            return "None";
        }

        StringBuilder stringBuilder = new StringBuilder();

        animalList.sort(Comparator.comparing(Animal::getName));

        for (int i = 0; i < animalList.size(); i++) {
            stringBuilder.append(animalList.get(i).getName());
            if (i < animalList.size() - 1) {
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.toString();
    }

    private List<Animal> getAllCleansedAnimalsInOrder() {
        List<Animal> listOfAllCleansedAnimal = new ArrayList<>();
        for (Center aCenterList : centerList) {
            listOfAllCleansedAnimal.addAll(aCenterList.getAnimalList().stream()
                    .filter(Animal::isCleansingStatus).collect(Collectors.toList()));
        }
        listOfAllCleansedAnimal.addAll(adoptedAnimals);
        listOfAllCleansedAnimal.sort(Comparator.comparing(Animal::getName));
        return listOfAllCleansedAnimal;
    }

    private List<Animal> getAllCastratedAnimalsInOrder() {
        List<Animal> listOfAllCastratedAnimal = new ArrayList<>();
        for (Center aCenterList : centerList) {
            listOfAllCastratedAnimal.addAll(aCenterList.getAnimalList().stream()
                    .filter(Animal::isCastratingStatus).collect(Collectors.toList()));
        }
        listOfAllCastratedAnimal.sort(Comparator.comparing(Animal::getName));
        return listOfAllCastratedAnimal;
    }

    private int animalsAwaitingAdoption() {
        int animalAwaitingAdoption = 0;
        for (Center aCenterList : centerList) {
            animalAwaitingAdoption += aCenterList.getAnimalList().stream().filter(Animal::isCleansingStatus).count();
        }
        return animalAwaitingAdoption;
    }

    private int animalsAwaitingCleansing() {
        int animalsAwaitingCleansing = 0;
        for (Center aCenterList : centerList) {
            if (aCenterList instanceof CleansingCenter) {
                animalsAwaitingCleansing += aCenterList.getAnimalList().stream().filter(Animal -> !Animal.isCleansingStatus()).count();
            }
        }
        return animalsAwaitingCleansing;
    }
}

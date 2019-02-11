package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.animals.Animal;
import com.musala.javacourse181112.pawinc.animals.Cat;
import com.musala.javacourse181112.pawinc.animals.Dog;
import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;
import com.musala.javacourse181112.pawinc.centers.CastrationCenter;
import com.musala.javacourse181112.pawinc.centers.CleansingCenter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


class AnimalCenterManager {
    private static final List<AdoptionCenter> ADOPTION_CENTER_LIST = new ArrayList<>();
    private static final List<CleansingCenter> CLEANSING_CENTER_LIST = new ArrayList<>();
    private static final List<CastrationCenter> CASTRATION_CENTER_LIST = new ArrayList<>();
    private static final List<Animal> CLEANSED_ANIMALS_LIST = new ArrayList<>();
    private static final List<Animal> ADOPTED_ANIMALS_LIST = new ArrayList<>();
    private static final List<Animal> CASTRATED_ANIMALS_LIST = new ArrayList<>();

    static void registerCleansingCenter(String name) {
        if (name.matches("\\A\\p{ASCII}*\\z")) {
            final CleansingCenter cleansingCenter = new CleansingCenter(name);
            cleansingCenter.setStoredAnimalsList(new ArrayList<>());
            CLEANSING_CENTER_LIST.add(cleansingCenter);
        } else {
            System.out.println("Invalid Name!");
        }

    }

    static void registerAdoptionCenter(String name) {
        if (name.matches("\\A\\p{ASCII}*\\z")) {
            final AdoptionCenter adoptionCenter = new AdoptionCenter(name);
            adoptionCenter.setStoredAnimalsList(new ArrayList<>());
            ADOPTION_CENTER_LIST.add(adoptionCenter);
        } else {
            System.out.println("Invalid Name!");
        }

    }

    static void registerCastrationCenter(String name) {
        if (name.matches("\\A\\p{ASCII}*\\z")) {
            final CastrationCenter castrationCenter = new CastrationCenter(name);
            castrationCenter.setStoredAnimalsList(new ArrayList<>());
            CASTRATION_CENTER_LIST.add(castrationCenter);
        } else {
            System.out.println("Invalid Name!");
        }

    }

    static void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        if (name.matches("\\A\\p{ASCII}*\\z") && age > 0 && learnedCommands > 0) {
            final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
            final Dog dog = new Dog(name, age, learnedCommands, adoptionCenter);
            adoptionCenter.getStoredAnimalsList().add(dog);
        } else {
            System.out.println("Invalid Name ,age or commands count!");
        }


    }

    static void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        if (name.matches("\\A\\p{ASCII}*\\z") && age > 0 && intelligenceCoefficient > 0) {
            final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
            final Cat cat = new Cat(name, age, intelligenceCoefficient, adoptionCenter);
            adoptionCenter.getStoredAnimalsList().add(cat);
        } else {
            System.out.println("Invalid Name , age or IQ!");
        }


    }

    static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
        final CleansingCenter cleansingCenter = findCleansingCenter(cleansingCenterName);
        adoptionCenter.sendForCleansing(cleansingCenter);
//        adoptionCenter.setStoredAnimalsList(cleansingCenter.getStoredAnimalsList());
    }

    static void sendForCastration(String adoptionCenterName, String castrationCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
        final CastrationCenter castrationCenter = findCastrationCenter(castrationCenterName);
        adoptionCenter.sendForCastration(castrationCenter);
    }

    static void cleanse(final String cleansingCenterName) {
        final CleansingCenter cleansingCenter = findCleansingCenter(cleansingCenterName);
        cleansingCenter.cleanse();
        CLEANSED_ANIMALS_LIST.addAll(cleansingCenter.getStoredAnimalsList());
        for (Animal animal : CLEANSED_ANIMALS_LIST) {
            animal.getAdoptionCenter()
                    .addAnimalToStoredAnimals(animal);
        }
    }

    static void adopt(final String adoptionCenterName) {
        final AdoptionCenter adoptionCenter = findAdoptionCenter(adoptionCenterName);
        ADOPTED_ANIMALS_LIST.addAll(adoptionCenter.adoptAnimals());
    }

    static void castrate(final String castrationCenterName) {
        final CastrationCenter castrationCenter = findCastrationCenter(castrationCenterName);
        castrationCenter.castrate();
        CASTRATED_ANIMALS_LIST.addAll(castrationCenter.getStoredAnimalsList());
    }

    static void printCastrationStatistics() {
        System.out.println("Paw Inc. Regular Castration Statistics");

        System.out.println("Castration Centers: " + CASTRATION_CENTER_LIST.size());

        CASTRATED_ANIMALS_LIST.sort(Comparator.comparing(Animal::getName));
        System.out.println("Castrated Animals: " + printAnimals(CASTRATED_ANIMALS_LIST));
    }

    static void printStatistics() {
        System.out.println("Paw Incorporative Regular Statistics");

        System.out.println("Adoption Centers: " + ADOPTION_CENTER_LIST.size());
        System.out.println("Cleansing Centers: " + CLEANSING_CENTER_LIST.size());

        ADOPTED_ANIMALS_LIST.sort(Comparator.comparing(Animal::getName));
        System.out.println("Adopted animals: " + printAnimals(ADOPTED_ANIMALS_LIST));

        CLEANSED_ANIMALS_LIST.sort(Comparator.comparing(Animal::getName));
        System.out.println("Cleansed animals: " + printAnimals(CLEANSED_ANIMALS_LIST));


        AtomicInteger awaitingAdoption = new AtomicInteger();
        AtomicInteger awaitingCleansing = new AtomicInteger();
        for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
            adoptionCenter.getStoredAnimalsList().forEach(animal -> {
                if (animal.isCleansed()) {
                    awaitingAdoption.getAndIncrement();
                }
            });

        }
        for (CleansingCenter cleansingCenter : CLEANSING_CENTER_LIST) {
            cleansingCenter.getStoredAnimalsList().forEach(animal -> {
                if (!animal.isCleansed()) {
                    awaitingCleansing.getAndIncrement();
                }
            });

        }

        System.out.println("Animals Awaiting Adoption: " + awaitingAdoption);
        System.out.println("Animals Awaiting Cleansing: " + awaitingCleansing);

    }

    private static String printAnimals(List<Animal> animalList) {
        if (animalList.size() == 0) {
            return "None";
        } else {
            final StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < animalList.size(); i++) {
                stringBuilder.append(animalList.get(i).getName());
                if (i == animalList.size() - 1) {
                    break;
                } else {
                    stringBuilder.append(", ");
                }


            }
            return stringBuilder.toString();
        }

    }

    private static AdoptionCenter findAdoptionCenter(String adoptionCenterName) {
        AdoptionCenter adoptionCenter = null;
        for (AdoptionCenter currentAdoptionCenter : ADOPTION_CENTER_LIST) {
            if (adoptionCenterName.equals(currentAdoptionCenter.getName())) {
                adoptionCenter = currentAdoptionCenter;
                return adoptionCenter;
            }

        }
        return null;
    }

    private static CleansingCenter findCleansingCenter(String cleanSingCenterName) {
        CleansingCenter cleansingCenter = null;
        for (CleansingCenter currentCleansingCenter : CLEANSING_CENTER_LIST) {
            if (cleanSingCenterName.equals(currentCleansingCenter.getName())) {
                cleansingCenter = currentCleansingCenter;
                return cleansingCenter;
            }
        }
        return null;
    }

    private static CastrationCenter findCastrationCenter(String castrationCenterName) {
        CastrationCenter castrationCenter = null;
        for (CastrationCenter currentCastrationCenter : CASTRATION_CENTER_LIST) {
            if (castrationCenterName.equals(currentCastrationCenter.getName())) {
                castrationCenter = currentCastrationCenter;
                return castrationCenter;
            }
        }
        return null;
    }
}

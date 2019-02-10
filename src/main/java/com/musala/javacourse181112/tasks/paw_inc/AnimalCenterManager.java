package com.musala.javacourse181112.tasks.paw_inc;

import com.musala.javacourse181112.tasks.paw_inc.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class AnimalCenterManager {
    private static final List<CleansingCenter> CLEANSING_CENTER_LIST = new ArrayList<>();
    private static final List<AdoptionCenter> ADOPTION_CENTER_LIST = new ArrayList<>();
    private static final List<String> ALL_CLEANSED_ANIMALS_NAMES = new ArrayList<>();
    private static final List<String> ALL_ADOPTED_ANIMALS_NAMES = new ArrayList<>();
    private static final List<CastrationCenter> CASTRATION_CENTER_LIST = new ArrayList<>();
    private static final List<String> ALL_CASTRATED_ANIMALS_NAMES = new ArrayList<>();

    private static List<CastrationCenter> getCastrationCenterList() {
        return CASTRATION_CENTER_LIST;
    }

    private static List<CleansingCenter> getCleansingCenterList() {
        return CLEANSING_CENTER_LIST;
    }

    private static List<AdoptionCenter> getAdoptionCenterList() {
        return ADOPTION_CENTER_LIST;
    }

    /**
     * Registers a Cleansing center with the given name
     */
    static void registerCleansingCenter(final String name) {
        final CleansingCenter cleansingCenter = new CleansingCenter();
        cleansingCenter.setName(name);
        CLEANSING_CENTER_LIST.add(cleansingCenter);
    }

    /**
     * Registers an Adoption center with the given name.
     */
    static void registerAdoptionCenter(final String name) {
        final AdoptionCenter adoptionCenter = new AdoptionCenter();
        adoptionCenter.setName(name);
        ADOPTION_CENTER_LIST.add(adoptionCenter);
    }

    /**
     * Registers a Castration center with the given name.
     */
    static void registerCastrationCenter(final String name) {
        final CastrationCenter castrationCenter = new CastrationCenter();
        castrationCenter.setName(name);
        CASTRATION_CENTER_LIST.add(castrationCenter);
    }

    /**
     * Registers a dog with the given name, age and amount of learned commands in the given Adoption center.
     */
    static void registerDog(final String name, final int age, final int learnedCommands, final String adoptionCenterName) {
        if (age >= 0 && learnedCommands >= 0) {
            final Dog dog = new Dog(name, age, adoptionCenterName, learnedCommands);
            for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
                if (adoptionCenter.getName().equals(adoptionCenterName)) {
                    adoptionCenter.getStoredAnimal().add(dog);
                }
            }
        } else {
            System.out.println("Enter correct data");
            System.exit(-1);
        }
    }

    /**
     * Registers a cat with the given name, age and intelligence coefficient in the given Adoption center.
     */
    static void registerCat(final String name, final int age, final int intelligenceCoefficient, final String adoptionCenterName) {
        if (age >= 0 && intelligenceCoefficient >= 0) {
            final Cat cat = new Cat(name, age, adoptionCenterName, intelligenceCoefficient);

            for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
                if (adoptionCenterName.equals(adoptionCenter.getName())) {
                    adoptionCenter.getStoredAnimal().add(cat);
                }
            }
        } else {
            System.out.println("Enter correct data");
            System.exit(-1);
        }
    }

    /**
     * Sends all UNCLEANSED animals from the given Adoption center to the given Cleansing center
     */
    static void sendForCleansing(final String adoptionCenterName, final String cleansingCenterName) {
        for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
            if (adoptionCenterName.equals(adoptionCenter.getName())) {
                final Iterator<Animal> iterator = adoptionCenter.getStoredAnimal().iterator();
                while (iterator.hasNext()) {
                    final Animal animal = iterator.next();
                    for (CleansingCenter cleansingCenter : AnimalCenterManager.getCleansingCenterList()) {
                        if (cleansingCenterName.equals(cleansingCenter.getName())) {
                            if (!animal.isCleaningStatus()) {
                                cleansingCenter.getStoredAnimal().add(animal);
                                iterator.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Sends all uncleansed animals from the given Adoption center to the given Castration center
     */
    static void sendForCastration(final String adoptionCenterName, final String castrationCenterName) {
        for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
            if (adoptionCenterName.equals((adoptionCenter.getName()))) {
                final Iterator<Animal> iterator = adoptionCenter.getStoredAnimal().iterator();
                while (iterator.hasNext()) {
                    final Animal animal = iterator.next();
                    for (CastrationCenter castrationCenter : AnimalCenterManager.getCastrationCenterList()) {
                        if (castrationCenterName.equals(castrationCenter.getName())) {
                            castrationCenter.getStoredAnimal().add(animal);
                            iterator.remove();
                        }
                    }
                }
            }
        }
    }

    /**
     * Cleanses all animals from the given Cleansing center and returns them to their corresponding Adoption centers.
     */
    static void cleanse(final String cleansingCenterName) {
        for (CleansingCenter cleansingCenter : CLEANSING_CENTER_LIST) {
            if (cleansingCenterName.equals(cleansingCenter.getName())) {
                for (Animal animal : cleansingCenter.getStoredAnimal()) {
                    animal.setCleaningStatus(true);
                    for (AdoptionCenter adoptionCenter : AnimalCenterManager.getAdoptionCenterList()) {
                        if (animal.getAdoptionCenter().equals(adoptionCenter.getName())) {
                            adoptionCenter.getStoredAnimal().add(animal);
                        }
                    }
                }
                cleansingCenter.getStoredAnimal().clear();
            }
        }
    }

    /**
     * All CLEANSED animals from the given Adoption center get adopted, and removed from the stored animals.
     */
    static void adopt(final String adoptionCenterName) {
        for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
            if (adoptionCenterName.equals(adoptionCenter.getName())) {
                final Iterator<Animal> iterator = adoptionCenter.getStoredAnimal().iterator();
                while (iterator.hasNext()) {
                    final Animal animal = iterator.next();
                    if (animal.isCleaningStatus()) {
                        adoptionCenter.getAdoptedAnimal().add(animal);
                        iterator.remove();
                    }
                }
            }
        }
    }

    /**
     * Castrates all animals from the given Castration center and returns them to their corresponding Adoption centers.
     */
    static void castrate(final String castrationCenterName) {
        for (CastrationCenter castrationCenter : CASTRATION_CENTER_LIST) {
            if (castrationCenterName.equals(castrationCenter.getName())) {
                for (Animal animal : castrationCenter.getStoredAnimal()) {
                    for (AdoptionCenter adoptionCenter : AnimalCenterManager.getAdoptionCenterList()) {
                        if (animal.getAdoptionCenter().equals(adoptionCenter.getName())) {
                            adoptionCenter.getStoredAnimal().add(animal);
                        }
                    }
                }
            }
        }
    }

    static void printStatistics() {
        for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
            for (Animal animal : adoptionCenter.getAdoptedAnimal()) {
                ALL_ADOPTED_ANIMALS_NAMES.add(animal.getName());
                ALL_CLEANSED_ANIMALS_NAMES.add(animal.getName());
            }
        }

        int awaitingAdoption = 0;
        for (AdoptionCenter adoptionCenter : ADOPTION_CENTER_LIST) {
            for (Animal animal : adoptionCenter.getStoredAnimal()) {
                if (animal.isCleaningStatus()) {
                    ALL_CLEANSED_ANIMALS_NAMES.add(animal.getName());
                    awaitingAdoption++;
                }
            }
        }

        int awaitingCleasing = 0;
        for (CleansingCenter cleansingCenter : CLEANSING_CENTER_LIST) {
            for (Animal animal : cleansingCenter.getStoredAnimal()) {
                if (!animal.isCleaningStatus()) {
                    awaitingCleasing++;
                }
            }
        }

        Collections.sort(ALL_ADOPTED_ANIMALS_NAMES);
        Collections.sort(ALL_CLEANSED_ANIMALS_NAMES);

        System.out.print("Paw Incorporative Regular Statistics" + System.lineSeparator() +
                "Adoption Centers: " + ADOPTION_CENTER_LIST.size() + System.lineSeparator() +
                "Cleansing Centers: " + CLEANSING_CENTER_LIST.size() + System.lineSeparator());

        if (!ALL_ADOPTED_ANIMALS_NAMES.isEmpty()) {
            System.out.print("Adopted Animals: " +
                    ALL_ADOPTED_ANIMALS_NAMES.stream().
                            map(Object::toString).
                            collect(Collectors.joining(", ")) + System.lineSeparator());
        } else {
            System.out.print("Adopted Animals: None" + System.lineSeparator());
        }

        if (!ALL_CLEANSED_ANIMALS_NAMES.isEmpty()) {
            System.out.print("Cleansed Animals: " +
                    ALL_CLEANSED_ANIMALS_NAMES.stream().
                            map(Object::toString).
                            collect(Collectors.joining(", ")) + System.lineSeparator());
        } else {
            System.out.print("Cleansed Animals: None" + System.lineSeparator());
        }

        System.out.print("Animals Awaiting Adoption:" + awaitingAdoption + System.lineSeparator() +
                "Animals Awaiting Cleansing: " + awaitingCleasing);

        System.exit(0);
    }

    static void castrationStatistics() {
        System.out.println("Paw Inc. Regular Castration Statistics" +
                System.lineSeparator() +
                "Castration Centers: " +
                CASTRATION_CENTER_LIST.size());

        for (CastrationCenter castrationCenter : CASTRATION_CENTER_LIST) {
            for (Animal animal : castrationCenter.getStoredAnimal()) {
                ALL_CASTRATED_ANIMALS_NAMES.add(animal.getName());
            }
        }
        Collections.sort(ALL_CASTRATED_ANIMALS_NAMES);

        if (!ALL_CASTRATED_ANIMALS_NAMES.isEmpty()) {
            System.out.print("Castrated Animals: " +
                    ALL_CASTRATED_ANIMALS_NAMES.stream().
                            map(Object::toString).
                            collect(Collectors.joining(", ")) +
                    System.lineSeparator());
        } else {
            System.out.print("Castrated Animals: None" +
                    System.lineSeparator());
        }
    }
}

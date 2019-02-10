package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.animal.Animal;
import com.musala.javacourse181112.pawinc.animal.Cat;
import com.musala.javacourse181112.pawinc.animal.Dog;
import com.musala.javacourse181112.pawinc.center.AdoptionCenter;
import com.musala.javacourse181112.pawinc.center.CastrationCenter;
import com.musala.javacourse181112.pawinc.center.Center;
import com.musala.javacourse181112.pawinc.center.CleansingCenter;

import java.util.*;
import java.util.stream.Collectors;

class AnimalCenterManager {
    private static List<Center> adoptionCentersList = new ArrayList<>();
    private static List<Center> cleansingCentersList = new ArrayList<>();
    private static List<Center> castrationCentersList = new ArrayList<>();
    private static final List<Animal> adoptedAnimalsList = new ArrayList<>();
    private static final List<Animal> cleansedAnimalsList = new ArrayList<>();
    private static final List<Animal> castratedAnimalsList = new ArrayList<>();
    private static int amountOfAnimalsWaitingForAdoption = 0;
    private static int amountOfAnimalsWaitingForCleansing = 0;
    final static Scanner scanner = new Scanner(System.in);

    /*
     * Registers an Adoption center with the given name
     */
    void registerAdoptionCenter(final String name) {
        Center adoptionCenter = new AdoptionCenter(name);
        adoptionCentersList.add(adoptionCenter);
    }

    /*
     * Registers a Cleansing center with the given name
     */
    void registerCleansingCenter(String name) {
        Center cleansingCenter = new CleansingCenter(name);
        cleansingCentersList.add(cleansingCenter);
    }

    /*
     * Registers a Castration center with the given name.
     */
    void registerCastrationCenter(String name) {
        Center castrationCenter = new CastrationCenter(name);
        castrationCentersList.add(castrationCenter);
    }

    /*
     * Registers a dog with the given name, age and amount of learned commands in the given Adoption center.
     */
    void registerDog(final String name,
                     final int age,
                     final int learnedCommands,
                     final String adoptionCenterName) {
        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);

        if (age >= 0 && learnedCommands >= 0 && adoptionCenter != null) {
            Animal dog = new Dog(name, age, learnedCommands, adoptionCenterName);
            dog.setAdoptionCenterName(adoptionCenterName);
            adoptionCenter.getStoredAnimals().add(dog);
        } else {
            System.out.println("Enter correct data");
        }
    }

    /*
     * Registers a cat with the given name, age and intelligence coefficient in the given Adoption center.
     */
    void registerCat(String name,
                     int age,
                     int intelligenceCoefficient,
                     String adoptionCenterName) {
        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);

        if (age >= 0 && intelligenceCoefficient >= 0 && adoptionCenter != null) {
            Animal cat = new Cat(name, age, intelligenceCoefficient, adoptionCenterName);
            adoptionCenter.getStoredAnimals().add(cat);
        } else {
            System.out.println("Enter correct data");
        }
    }

    /*
     * Sends all uncleansed animals from the given Adoption center to the given Castration center.
     */
    void sendForCastration(String adoptionCenterName, String castrationCenterName) {
        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);
        Center castrationCenter = findCastrationCenterByName(castrationCenterName);

        for (Iterator<Animal> iterator = adoptionCenter.getStoredAnimals().iterator(); iterator.hasNext(); ) {
            Animal animal = iterator.next();
            if (animal.isCleansed() == false) {
                castrationCenter.getStoredAnimals().add(animal);
                iterator.remove();
            }
        }
    }

    /*
     * Castrates all animals from the given Castration center and returns them to their corresponding Adoption centers.
     */
    void castrate(String castrationCenterName) {
        Center castrationCenter = findCastrationCenterByName(castrationCenterName);
        Center adoptionCenter;

        for (Iterator<Animal> iterator = castrationCenter.getStoredAnimals().iterator(); iterator.hasNext(); ) {
            Animal animal = iterator.next();
            animal.setCastrated(true);
            castratedAnimalsList.add(animal);
            adoptionCenter = this.findAdoptionCenterByName(animal.getAdoptionCenterName());
            adoptionCenter.getStoredAnimals().add(animal);
            iterator.remove();
        }
    }

    /*
     *  Sends all UNCLEANSED animals from the given Adoption center to the given Cleansing center
     */
    void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);
        Center cleansingCenter = findCleansingCenterByName(cleansingCenterName);

        for (Iterator<Animal> iterator = adoptionCenter.getStoredAnimals().iterator(); iterator.hasNext(); ) {
            Animal animal = iterator.next();
            if (animal.isCleansed() == false) {
                cleansingCenter.getStoredAnimals().add(animal);
                iterator.remove();
                amountOfAnimalsWaitingForCleansing++;
            }
        }
    }

    /*
     * Cleanses all animals from the given Cleansing center and returns them to their corresponding Adoption centers.
     */
    void cleanse(String cleansingCenterName) {
        Center cleansingCenter = findCleansingCenterByName(cleansingCenterName);
        Center adoptionCenter;
        for (Iterator<Animal> iterator = cleansingCenter.getStoredAnimals().iterator(); iterator.hasNext(); ) {
            Animal animal = iterator.next();
            animal.setCleansed(true);
            cleansedAnimalsList.add(animal);
            adoptionCenter = this.findAdoptionCenterByName(animal.getAdoptionCenterName());
            adoptionCenter.getStoredAnimals().add(animal);
            iterator.remove();
            amountOfAnimalsWaitingForAdoption++;
            amountOfAnimalsWaitingForCleansing--;
        }
    }

    /*
     * All CLEANSED animals from the given Adoption center get adopted, and removed from the stored animals.
     */
    void adopt(String adoptionCenterName) {
        Center adoptionCenter = findAdoptionCenterByName(adoptionCenterName);

        for (Iterator<Animal> iterator = adoptionCenter.getStoredAnimals().iterator(); iterator.hasNext(); ) {
            Animal animal = iterator.next();
            if (animal.isCleansed()) {
                adoptedAnimalsList.add(animal);
                iterator.remove();
                amountOfAnimalsWaitingForAdoption--;
            }
        }
    }

    void castrationStatistics() {
        System.out.println("Paw Inc. Regular Castration Statistics");
        System.out.println("Castration Centers: " + castrationCentersList.size());
        System.out.print("Castrated Animals: ");
        if (castratedAnimalsList.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(castratedAnimalsList.stream()
                    .sorted(Comparator.comparing(Animal::getName))
                    .map(Animal::getName)
                    .collect(Collectors.joining(", "))
            );
        }
    }

    void printStatistics() {
        System.out.println("Paw Incorporative Regular Statistics:");
        System.out.println("Adoption Centers: " + adoptionCentersList.size());
        System.out.println("Cleansing Centers: " + cleansingCentersList.size());
        System.out.print("Adopted Animals: ");
        if (adoptedAnimalsList.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(adoptedAnimalsList.stream()
                    .sorted(Comparator.comparing(Animal::getName))
                    .map(Animal::getName)
                    .collect(Collectors.joining(", "))
            );
        }

        System.out.print("Cleansed Animals: ");
        if (cleansedAnimalsList.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(cleansedAnimalsList.stream()
                    .sorted(Comparator.comparing(Animal::getName))
                    .map(Animal::getName)
                    .collect(Collectors.joining(", ")));
        }

        System.out.println("Animals Awaiting Adoption: " + amountOfAnimalsWaitingForAdoption);
        System.out.println("Animals Awaiting Cleansing: " + amountOfAnimalsWaitingForCleansing);
    }

    static void chooseCommandOption() {
        final AnimalCenterManager animalCenterManager = new AnimalCenterManager();

        while (!scanner.toString().equals("Paw Paw Pawah")) {
            String[] command = scanner.nextLine().split("[ ][|][ ]");

            switch (command[0]) {
                case "RegisterCleansingCenter":
                    animalCenterManager.registerCleansingCenter(command[1]);
                    break;

                case "RegisterAdoptionCenter":
                    animalCenterManager.registerAdoptionCenter(command[1]);
                    break;

                case "RegisterCastrationCenter":
                    animalCenterManager.registerCastrationCenter(command[1]);
                    break;

                case "RegisterDog":
                    animalCenterManager.registerDog(command[1], Integer.parseInt(command[2]), Integer.parseInt(command[3]), command[4]);
                    break;

                case "RegisterCat":
                    animalCenterManager.registerCat(command[1], Integer.parseInt(command[2]), Integer.parseInt(command[3]), command[4]);
                    break;

                case "SendForCastration":
                    animalCenterManager.sendForCastration(command[1], command[2]);

                case "SendForCleansing":
                    animalCenterManager.sendForCleansing(command[1], command[2]);
                    break;

                case "Castrate":
                    animalCenterManager.castrate(command[1]);
                    break;

                case "Cleanse":
                    animalCenterManager.cleanse(command[1]);
                    break;

                case "Adopt":
                    animalCenterManager.adopt(command[1]);
                    break;

                case "CastrationStatistics":
                    animalCenterManager.castrationStatistics();
                    break;

                case "Paw Paw Pawah":
                    animalCenterManager.printStatistics();
                    break;

                default:
                    System.out.println("No such command.");
                    break;
            }
        }
    }

    private Center findAdoptionCenterByName(String adoptionCenterName) {
        for (Center adoptionCenter : adoptionCentersList) {
            if (adoptionCenter.getName().equals(adoptionCenterName)) {
                return adoptionCenter;
            }
        }

        return null;
    }

    private Center findCleansingCenterByName(String cleansingCenterName) {
        for (Center cleansingCenter : cleansingCentersList) {
            if (cleansingCenter.getName().equals(cleansingCenterName)) {
                return cleansingCenter;
            }
        }

        return null;
    }

    private Center findCastrationCenterByName(String castrationCenterName) {
        for (Center castrationCenter : castrationCentersList) {
            if (castrationCenter.getName().equals(castrationCenterName)) {
                return castrationCenter;
            }
        }

        return null;
    }
}

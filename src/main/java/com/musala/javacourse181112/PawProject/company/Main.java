package com.musala.javacourse181112.PawProject.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, AdoptionCenter> adoptionCenters = new HashMap<>();
        TreeSet<String> adoptedAnimals = new TreeSet<>();

        HashMap<String, CleansingCenter> cleansingCenters = new HashMap<>();
        TreeSet<String> cleansedAnimals = new TreeSet<>();

        HashMap<String, CastrationCenter> castrationCenters = new HashMap<>();
        TreeSet<String> castratedAnimals = new TreeSet<>();

        while (true) {
            String[] command = scan.readLine().split(" \\| ");
            if (command[0].equals("Paw Paw Pawah")) break;
            switch (command[0]) {
                case "RegisterAdoptionCenter":
                    adoptionCenters.put(command[1], new AdoptionCenter(command[1]));
                    break;
                case "RegisterCleansingCenter":
                    cleansingCenters.put(command[1], new CleansingCenter(command[1]));
                    break;
                case "RegisterCastrationCenter":
                    castrationCenters.put(command[1], new CastrationCenter(command[1]));
                    break;
                case "RegisterDog":
                    adoptionCenters.get(command[4]).addNewAnimal(new Dog(command[1],
                            Integer.valueOf(command[2]), Integer.valueOf(command[3]), adoptionCenters.get(command[4])));
                    break;
                case "RegisterCat":
                    adoptionCenters.get(command[4]).addNewAnimal(new Cat(command[1],
                            Integer.valueOf(command[2]), Integer.valueOf(command[3]), adoptionCenters.get(command[4])));
                    break;
                case "SendForCleansing":
                    adoptionCenters.get(command[1]).sendAnimalsForCleaning(cleansingCenters.get(command[2]));
                    break;
                case "SendForCastration":
                    adoptionCenters.get(command[1]).sendAnimalsForCastration(castrationCenters.get(command[2]));
                    break;
                case "Cleanse":
                    cleansingCenters.get(command[1]).getUncleanedAnimals().forEach(animal -> cleansedAnimals.add(animal.getName()));
                    cleansingCenters.get(command[1]).cleanAnimalsAndSendAnimalsToHome();
                    break;
                case "Adopt":
                    adoptionCenters.get(command[1]).getCleanedAnimals().forEach(animal -> adoptedAnimals.add(animal.getName()));
                    adoptionCenters.get(command[1]).adoptAnimals();
                    break;
                case "Castrate":
                    castrationCenters.get(command[1]).getUncleanedAnimals().forEach(animal -> castratedAnimals.add(animal.getName()));
                    castrationCenters.get(command[1]).castrateAnimals();
                    break;
                case "CastrationStatistics":
                    System.out.println("Paw Inc. Regular Castration Statistics");
                    System.out.println("Castration Centers: " + castrationCenters.size());
                    System.out.print("Castrated Animals: ");
                    System.out.println(castratedAnimals.size() > 0 ? Arrays.toString(castratedAnimals.toArray()).replace("[", "").replace("]","") : "None");
                default:
                    break;
            }
        }
        System.out.println("Paw Incorporative Regular Statistics");
        System.out.println("Adoption Centers: " + adoptionCenters.size());
        System.out.println("Cleansing Centers: " + cleansingCenters.size());
        System.out.print("Adopted Animals: ");

        System.out.println(adoptedAnimals.size() > 0 ? Arrays.toString(adoptedAnimals.toArray()).replace("[", "").replace("]","") : "None");

        System.out.print("Cleansed Animals: ");


        System.out.println(cleansedAnimals.size() > 0 ? Arrays.toString(cleansedAnimals.toArray()).replace("[", "").replace("]","") : "None");

        final int[] awaitingAdoptionAnimals = {0};

        adoptionCenters.forEach((key, value) -> awaitingAdoptionAnimals[0] += value.getCleanedAnimals().size());

        System.out.println("Animals Awaiting Adoption: " + awaitingAdoptionAnimals[0]);

        final int[] awaitingCleaningAnimals = {0};

        cleansingCenters.forEach((key, value) -> awaitingCleaningAnimals[0] += value.getUncleanedAnimals().size());

        System.out.println("Animals Awaiting Cleansing: " + awaitingCleaningAnimals[0]);
    }
}

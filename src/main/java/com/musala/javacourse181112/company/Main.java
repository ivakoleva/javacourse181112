package com.musala.javacourse181112.company;


import com.musala.javacourse181112.company.commandEngine.AnimalCenterManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        AnimalCenterManager centerManager = new AnimalCenterManager();

        String stopCommand = "Paw Paw Pawah";
        String[] commandLine = reader.readLine().split("\\|");
        while (!commandLine[0].equals(stopCommand)) {
            try {
                processingCommands(commandLine, centerManager);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            commandLine = reader.readLine().split("\\|");
        }
        centerManager.printStatistics();
    }

    private static void processingCommands(String[] commandLine, AnimalCenterManager centerManager) {
        String command = commandLine[0].trim();

        switch (command) {
            case "RegisterCleansingCenter":
                registerCleansingCenter(commandLine, centerManager);
                break;
            case "RegisterAdoptionCenter":
                registerAdoptionCenter(commandLine, centerManager);
                break;
            case "RegisterDog":
                registerDog(commandLine, centerManager);
                break;
            case "RegisterCat":
                registerCat(commandLine, centerManager);
                break;
            case "SendForCleansing":
                sendForCleansing(commandLine, centerManager);
                break;
            case "Cleanse":
                cleanse(commandLine, centerManager);
                break;
            case "Adopt":
                adopt(commandLine, centerManager);
                break;
            case "RegisterCastrationCenter":
                registerCastrationCenter(commandLine, centerManager);
                break;
            case "SendForCastration":
                sendForCastration(commandLine, centerManager);
                break;
            case "Castrate":
                castrate(commandLine, centerManager);
                break;
            case "CastrationStatistics":
                castrationStatistics(centerManager);
                break;
        }
    }

    private static void castrationStatistics(AnimalCenterManager centerManager) {
//    o  Prints statistics about all the animals that have been castrated.
//    o  The format is:
//          “Paw Inc. Regular Castration Statistics
//           Castration Centers: {amountOfCastrationCenters}
//           Castrated Animals: {castratedAnimal1Name}, {castratedAnimal2Name}…”

        centerManager.castrationStatistics();
    }

    private static void castrate(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> Castrate | {castrationCenterName}
        String castrationCenterName = commandLine[1].trim();
        centerManager.castrate(castrationCenterName);
    }

    private static void sendForCastration(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> SendForCleansing | {adoptionCenterName} | {castrationCenterName}
        String adoptionCenterName = commandLine[1].trim();
        String castrationCenterName = commandLine[2].trim();
        centerManager.sendForCastration(adoptionCenterName, castrationCenterName);
    }

    private static void registerCastrationCenter(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> RegisterCastrationCenter | {name}
        String name = commandLine[1].trim();
        centerManager.registerCastrationCenter(name);
    }

    private static void adopt(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> Adopt | {adoptionCenterName}
        String adoptionCenterName = commandLine[1].trim();
        centerManager.adopt(adoptionCenterName);
    }

    private static void cleanse(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> Cleanse | {cleansingCenterName}
        String cleansingCenterName = commandLine[1].trim();
        centerManager.cleanse(cleansingCenterName);
    }

    private static void sendForCleansing(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> SendForCleansing | {adoptionCenterName} | {cleansingCenterName}
        String adoptionCenterName = commandLine[1].trim();
        String cleansingCenterName = commandLine[2].trim();
        centerManager.sendForCleansing(adoptionCenterName, cleansingCenterName);
    }

    private static void registerCat(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> RegisterCat | {name} | {age| | {intelligenceCoefficient} | {adoptionCenterName}
        String name = commandLine[1].trim();
        int age = Integer.parseInt(commandLine[2].trim());
        int intelligenceCoefficient = Integer.parseInt(commandLine[3].trim());
        String adoptionCenterName = commandLine[4].trim();

        centerManager.registerCat(name, age, intelligenceCoefficient, adoptionCenterName);
    }

    private static void registerDog(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> RegisterDog | {name} | {age} | {learnedCommands} | {adoptionCenterName}
        String name = commandLine[1].trim();
        int age = Integer.parseInt(commandLine[2].trim());
        int learnedCommands = Integer.parseInt(commandLine[3].trim());
        String adoptionCenterName = commandLine[4].trim();

        centerManager.registerDog(name, age, learnedCommands, adoptionCenterName);
    }

    private static void registerAdoptionCenter(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> RegisterAdoptionCenter | {name}
        String name = commandLine[1].trim();
        centerManager.registerAdoptionCenter(name);
    }

    private static void registerCleansingCenter(String[] commandLine, AnimalCenterManager centerManager) {
        //input -> RegisterCleansingCenter | {name}
        String name = commandLine[1].trim();
        centerManager.registerCleansingCenter(name);
    }
}

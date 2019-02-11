package com.musala.javacourse181112.ProjectPetko;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        AnimalCenterManager animalCenterManager = new AnimalCenterManager();
        boolean castrationFlag = false;

        Scanner scan = new Scanner(System.in);

        String[] commandArgs = null;

        do {
            commandArgs = scan.nextLine().split(" \\| ");

            String command = commandArgs[0];

            switch (command) {
                case "RegisterAdoptionCenter":
                    String adoptionCenterName = commandArgs[1];
                    animalCenterManager.registerAdoptionCenter(adoptionCenterName);
                    break;
                case "RegisterCleansingCenter":
                    String cleansingCenterName = commandArgs[1];
                    animalCenterManager.registerCleansingCenter(cleansingCenterName);
                    break;
                case "RegisterCastrationCenter":
                    castrationFlag = true;
                    String castrationCenterName = commandArgs[1];
                    animalCenterManager.registerCastrationCenter(castrationCenterName);
                    break;
                case "RegisterDog":
                    String dogName = commandArgs[1];
                    int dogAge = Integer.parseInt(commandArgs[2]);
                    int learnedCommands = Integer.parseInt(commandArgs[3]);
                    String dogAdoptionCenterName = commandArgs[4];
                    animalCenterManager.registerDog(dogName, dogAge, learnedCommands, dogAdoptionCenterName);
                    break;
                case "RegisterCat":
                    String catName = commandArgs[1];
                    int catAge = Integer.parseInt(commandArgs[2]);
                    int intelligenceCoefficient = Integer.parseInt(commandArgs[3]);
                    String catAdoptionCenterName = commandArgs[4];
                    animalCenterManager.registerCat(catName, catAge, intelligenceCoefficient, catAdoptionCenterName);
                    break;
                case "SendForCleansing":
                    String from = commandArgs[1];
                    String to = commandArgs[2];
                    animalCenterManager.sendForCleansing(from, to);
                    break;
                case "SendForCastration":
                    String fromAdoptionCenter = commandArgs[1];
                    String toCastrationCenter = commandArgs[2];
                    animalCenterManager.sendForCastration(fromAdoptionCenter, toCastrationCenter);
                    break;
                case "Cleanse":
                    animalCenterManager.cleanse(commandArgs[1]);
                    break;
                case "Castrate":
                    animalCenterManager.castrate(commandArgs[1]);
                    break;
                case "Adopt":
                    animalCenterManager.adopt(commandArgs[1]);
                    break;
                default:
                    break;
            }
        } while (!commandArgs[0].equals("Paw Paw Pawah"));

        if (castrationFlag == false){
            animalCenterManager.printRegularStatistics();
        }
        else {
            animalCenterManager.printCastrationStatistics();
        }
    }
}

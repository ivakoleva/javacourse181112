/*
package com.musala.javacourse181112.pawinc;

import java.util.Scanner;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Commands();
    }

    private static void Commands() {
        while (App.SCANNER.hasNext()) {
            String commandsString = App.SCANNER.nextLine();

            String[] commandsArray = commandsString.split("[ ][|][ ]");

            switch (commandsArray[0]) {
                case "RegisterAdoptionCenter":
                    AnimalCenterManager.registerAdoptionCenter(commandsArray[1]);
                    break;

                case "RegisterCleansingCenter":
                    AnimalCenterManager.registerCleansingCenter(commandsArray[1]);
                    break;
                //case "RegisterCastrationCenter":
                //  AnimalCenterManager.registerCastrationCenter(commandsArray[1]);
                //break;
                case "RegisterDog":
                    AnimalCenterManager.registerDog(commandsArray[1],
                            Integer.parseInt(commandsArray[2]),
                            Integer.parseInt(commandsArray[3]),
                            commandsArray[4]);
                    break;
                case "RegisterCat":
                    AnimalCenterManager.registerCat(commandsArray[1],
                            Integer.parseInt(commandsArray[2]),
                            Integer.parseInt(commandsArray[3]),
                            commandsArray[4]);
                    break;
                case "SendForCleansing":
                    AnimalCenterManager.sendForCleansing(commandsArray[1], commandsArray[2]);
                    break;
                case "Cleanse":
                    AnimalCenterManager.cleanse(commandsArray[1]);
                    break;
                case "Adopt":
                    AnimalCenterManager.adopt(commandsArray[1]);
                    break;
//                case "Castrate":
//                    AnimalCenterManager.castrate(commandsArray[1]);
//                    break;
//                case "SendForCastration":
//                    AnimalCenterManager.sendForCastration(commandsArray[1], commandsArray[2]);
//                    break;
//                case "CastrationStatistics":
//                    AnimalCenterManager.printCastrationStatistics();
//                    break;
                case "Paw Paw Pawah":
                    // AnimalCenterManager.printStatistics();
                    break;
            }
        }
    }
}
*/

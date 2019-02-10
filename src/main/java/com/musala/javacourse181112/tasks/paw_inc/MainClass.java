package com.musala.javacourse181112.tasks.paw_inc;

import java.util.Scanner;

public class MainClass {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(final String[] args) {
        inputData();
    }

    private static void inputData() {
        while (MainClass.SCANNER.hasNext()) {
            String inputText = MainClass.SCANNER.nextLine();

            String[] commands = inputText.split("[ ][|][ ]");

            switch (commands[0]) {
                case "RegisterCleansingCenter":
                    AnimalCenterManager.registerCleansingCenter(commands[1]);
                    break;

                case "RegisterAdoptionCenter":
                    AnimalCenterManager.registerAdoptionCenter(commands[1]);
                    break;

                case "RegisterCastrationCenter":
                    AnimalCenterManager.registerCastrationCenter(commands[1]);
                    break;

                case "RegisterDog":
                    AnimalCenterManager.registerDog(commands[1], Integer.parseInt(commands[2]), Integer.parseInt(commands[3]), commands[4]);
                    break;

                case "RegisterCat":
                    AnimalCenterManager.registerCat(commands[1], Integer.parseInt(commands[2]), Integer.parseInt(commands[3]), commands[4]);
                    break;

                case "SendForCleansing":
                    AnimalCenterManager.sendForCleansing(commands[1], commands[2]);
                    break;

                case "SendForCastration":
                    AnimalCenterManager.sendForCastration(commands[1], commands[2]);
                    break;

                case "Cleanse":
                    AnimalCenterManager.cleanse(commands[1]);
                    break;

                case "Adopt":
                    AnimalCenterManager.adopt(commands[1]);
                    break;

                case "Castrate":
                    AnimalCenterManager.castrate(commands[1]);
                    break;

                case "Paw Paw Pawah":
                    AnimalCenterManager.castrationStatistics();
                    AnimalCenterManager.printStatistics();
                    break;
            }
        }
    }
}
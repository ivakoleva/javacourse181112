
package com.musala.javacourse181112.pawinc;

import java.util.Scanner;

/*
 Created by Kristina Stoyanova on 5.2.2019 г.
*/

public class PawIncorporation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String commands = scanner.nextLine();

            String[] eachCommand = commands.split("[ ][|][ ]");

            switch (eachCommand[0]) {
                case "RegisterAdoptionCenter":
                    AnimalCenterManager.registerAdoptionCenter(eachCommand[1]);
                    break;
                case "RegisterCleansingCenter":
                    AnimalCenterManager.registerCleansingCenter(eachCommand[1]);
                    break;
                case "RegisterDog":
                    AnimalCenterManager.registerDog
                            (eachCommand[1], Integer.parseInt(eachCommand[2]),
                                    Integer.parseInt(eachCommand[3]), eachCommand[4]);
                    break;
                case "RegisterCat":
                    AnimalCenterManager.registerCat
                            (eachCommand[1], Integer.parseInt(eachCommand[2]),
                                    Integer.parseInt(eachCommand[3]), eachCommand[4]);
                    break;
                case "SendForCleansing":
                    AnimalCenterManager.sendForCleansing
                            (eachCommand[1], eachCommand[2]);
                    break;
                case "Cleanse":
                    AnimalCenterManager.cleanse
                            (eachCommand[1]);
                    break;
                case "Adopt":
                    AnimalCenterManager.adopt
                            (eachCommand[1]);
                    break;
                case "Paw Paw Pawah":
                    AnimalCenterManager.printStatics();
            }
        }
    }
}
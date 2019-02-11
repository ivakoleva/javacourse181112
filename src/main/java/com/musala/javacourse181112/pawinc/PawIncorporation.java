
package com.musala.javacourse181112.pawinc;

import java.util.Scanner;

/*
 Created by Kristina Stoyanova on 5.2.2019 г.
*/

public class PawIncorporation {
    public static void main(String[] args) {
        long startTime = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String commands = scanner.nextLine();
            if (startTime == 0) {
                startTime = System.currentTimeMillis();
            }

            String[] eachCommand = commands.split("[ ][|][ ]");

            switch (eachCommand[0]) {
                case "RegisterAdoptionCenter":
                    if (PawIncUtils.isAscii(eachCommand[1]))
                        AnimalCenterManager.registerAdoptionCenter(eachCommand[1]);
                    else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "RegisterCleansingCenter":
                    if (PawIncUtils.isAscii(eachCommand[1]))
                        AnimalCenterManager.registerCleansingCenter(eachCommand[1]);
                    else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "RegisterCastrationCenter":
                    if (PawIncUtils.isAscii(eachCommand[1]))
                        AnimalCenterManager.registerCastrationCenter(eachCommand[1]);
                    else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "RegisterDog":
                    if (PawIncUtils.isAscii(eachCommand[1]) && PawIncUtils.isAscii(eachCommand[4])
                            && PawIncUtils.isValidInt(Integer.parseInt(eachCommand[2])) && PawIncUtils.isValidInt(Integer.parseInt(eachCommand[3]))) {
                        AnimalCenterManager.registerDog
                                (eachCommand[1], Integer.parseInt(eachCommand[2]),
                                        Integer.parseInt(eachCommand[3]), eachCommand[4]);
                    } else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "RegisterCat":
                    if (PawIncUtils.isAscii(eachCommand[1]) && PawIncUtils.isAscii(eachCommand[4])
                            && PawIncUtils.isValidInt(Integer.parseInt(eachCommand[2])) && PawIncUtils.isValidInt(Integer.parseInt(eachCommand[3]))) {
                        AnimalCenterManager.registerCat
                                (eachCommand[1], Integer.parseInt(eachCommand[2]),
                                        Integer.parseInt(eachCommand[3]), eachCommand[4]);
                    } else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "SendForCleansing":
                    if (PawIncUtils.isAscii(eachCommand[1]) && PawIncUtils.isAscii(eachCommand[2])) {
                        AnimalCenterManager.sendForCleansing
                                (eachCommand[1], eachCommand[2]);
                    } else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "SendForCastration":
                    if (PawIncUtils.isAscii(eachCommand[1]) && PawIncUtils.isAscii(eachCommand[2])) {
                        AnimalCenterManager.sendForCastration(eachCommand[1], eachCommand[2]);
                    } else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;

                case "Cleanse":
                    if (PawIncUtils.isAscii(eachCommand[1])) {
                        AnimalCenterManager.cleanse(eachCommand[1]);
                    } else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "Adopt":
                    if (PawIncUtils.isAscii(eachCommand[1])) {
                        AnimalCenterManager.adopt
                                (eachCommand[1]);
                    } else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "Castrate":
                    if (PawIncUtils.isAscii(eachCommand[1])) {
                        AnimalCenterManager.castrate(eachCommand[1]);
                    } else {
                        System.out.println("Error: You have entered an invalid input.");
                        System.exit(1);
                    }
                    break;
                case "CastrationStatistics":
                    AnimalCenterManager.printCastrationStatistics();
                    break;
                case "Paw Paw Pawah":
                    AnimalCenterManager.printStatics();
                    PawIncUtils.isInAllowedMemoryAndTime(startTime);
                    System.exit(0);
                    break;
            }
        }
    }
}
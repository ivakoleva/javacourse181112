package com.musala.javacourse181112.pawinc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        AnimalCenterManager manager = new AnimalCenterManager();
        String line = reader.readLine();

        while (!line.equals("Paw Paw Pawah")) {
            String[] cmdArgs = line.split(" \\| ");
            String commandType = cmdArgs[0];
            switch (commandType) {
                case "RegisterCleansingCenter":
                    manager.registerCleansingCenter(cmdArgs[1]);
                    break;
                case "RegisterAdoptionCenter":
                    manager.registerAdoptionCenter(cmdArgs[1]);
                    break;
                case "RegisterCastrationCenter":
                    manager.registerCastrationCenter(cmdArgs[1]);
                    break;
                case "RegisterDog":
                    manager.registerDog(
                            cmdArgs[1],
                            Integer.parseInt(cmdArgs[2]),
                            Integer.parseInt(cmdArgs[3]),
                            cmdArgs[4]
                    );
                    break;
                case "RegisterCat":
                    manager.registerCat(
                            cmdArgs[1],
                            Integer.parseInt(cmdArgs[2]),
                            Integer.parseInt(cmdArgs[3]),
                            cmdArgs[4]
                    );
                    break;
                case "SendForCleansing":
                    manager.sendForCleansing(cmdArgs[1], cmdArgs[2]);
                    break;
                case "SendForCastration":
                    manager.sendForCastration(cmdArgs[1], cmdArgs[2]);
                    break;
                case "Cleanse":
                    manager.cleanse(cmdArgs[1]);
                    break;
                case "Castrate":
                    manager.castrate(cmdArgs[1]);
                    break;
                case "Adopt":
                    manager.adopt(cmdArgs[1]);
                    break;
                case "CastrationStatistics":
                    manager.printCastrationStatistics();
                default:
                    break;
            }

            line = reader.readLine();
        }

        manager.printStatistics();
    }
}

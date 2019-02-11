/*
package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.pawinc.AnimalCenterManager;

import java.util.Scanner;

public class PawInc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalCenterManager animalCenterManager = new AnimalCenterManager();
        String line;
        while (true) {
            line = scanner.nextLine();
            final String[] commands = line.split("[ ][|][ ]");
            for (CommandsValues command : CommandsValues.values()) {
                if (command.getLabel().equals(commands[0])) {
                    command.makeItRainCatsAndDogs(animalCenterManager, commands);
                }
            }
        }
    }
}*/

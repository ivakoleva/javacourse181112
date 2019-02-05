package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.classes.Command;

import java.util.Scanner;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class PawIncorporation {

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final AnimalCenterManager animalCenterManager = new AnimalCenterManager();
        String line;

        while (true) {
            line = scan.nextLine();
            final String[] commands = line.split("[ ][|][ ]");
            for (Command command : Command.values()) {
                if (command.getLabel().equals(commands[0])) {
                    command.invoke(animalCenterManager, commands);
                }
            }
        }
    }
}

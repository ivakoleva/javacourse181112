package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.classes.Command;

import java.util.Scanner;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class PawIncorporated {

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final AnimalCenterManager animalCenterManager = new AnimalCenterManager();

        String line;

        while (true) {
            line = scan.nextLine();
            final String[] command = line.split("[ ][|][ ]");
            Command thisCommand = findCommand(command[0]);
            if (thisCommand != null) {
                thisCommand.invoke(animalCenterManager, command);
            } else {
                System.err.println("Invalid command");
                System.exit(1);
            }
        }
    }

    private static Command findCommand(final String label) {
        for (Command command : Command.values()) {
            if (command.getLabel().equals(label)) {
                return command;
            }
        }
        return null;
    }
}

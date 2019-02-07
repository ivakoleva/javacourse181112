package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.model.Command;

import java.util.Scanner;

import static com.musala.javacourse181112.paw_inc.Utils.isASCII;

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
            if (isASCII.test(line)) {
                final String[] command = line.split("[ ][|][ ]");
                Command thisCommand = findCommand(command[0]);
                if (thisCommand != null) {
                    thisCommand.invoke(animalCenterManager, command);
                } else {
                    System.err.println("Invalid command2");
                    System.exit(1);
                }
            } else {
                System.err.println("Invalid command1");
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

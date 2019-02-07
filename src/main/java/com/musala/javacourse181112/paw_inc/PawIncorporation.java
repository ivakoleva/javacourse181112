package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.classes.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class PawIncorporation {

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final AnimalCenterManager animalCenterManager = new AnimalCenterManager();
        final Map<String, Command> commands = new HashMap<>();
        for (Command command : Command.values()) {
            commands.put(command.getLabel(), command);
        }
        String line;

        while (true) {
            line = scan.nextLine();
            final String[] command = line.split("[ ][|][ ]");
            if (commands.containsKey(command[0])) {
                commands.get(command[0]).invoke(animalCenterManager, command);
            } else {
                System.err.println("Invalid command");
                System.exit(1);
            }
        }
    }
}

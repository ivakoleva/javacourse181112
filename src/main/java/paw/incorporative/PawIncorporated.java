package paw.incorporative;

import java.nio.charset.Charset;
import java.util.Scanner;

public class PawIncorporated {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final AnimalCenterManager animalCenterManager = new AnimalCenterManager();

        String line = scan.nextLine();
        while (true) {
            if (Charset.forName("US-ASCII").newEncoder().canEncode(line)) {
                final String[] command = line.split("[ ][|][ ]");
                Command thisCommand = findCommand(command[0]);
                if (thisCommand != null) {
                    thisCommand.invoke(animalCenterManager, command);
                } else {
                    System.err.println("Command not found");
                    System.exit(1);
                }
            } else {
                System.err.println("Invalid command");
                System.exit(1);
            }
            line = scan.nextLine();
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
package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.enums.Commands;

import java.util.Scanner;

public class PawIncApplication {
    static final Scanner IN = new Scanner(System.in);
    public static long startTime = 0;

    public static void main(String[] args) {
        String line;
        //noinspection InfiniteLoopStatement
        while (true) {
            line = IN.nextLine();
            if (startTime == 0) {
                startTime = System.currentTimeMillis();
            }

            if (PawIncUtils.isASCII.test(line)) {


                final String[] inputCommands = line.split("[ ][|][ ]");


                for (Commands command : Commands.values()) {
                    if (command.getLabel().equals(inputCommands[0])) {
                        command.runCommand(inputCommands);
                    }
                }

            } else {
                System.out.println("Not a valid ascii table character");
            }
        }


    }

}

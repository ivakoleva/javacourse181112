package com.musala.javacourse181112.tasks;

import java.util.Scanner;
// v2.0
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops;
        do {
            System.out.println("Input loops count");
            loops = scanner.nextInt();
        } while (loops < 0);

        for (int i = 0; i < loops; i++) {
            int a, b;
            do {
                System.out.println("Please input ages to calculate");
                a = scanner.nextInt();
                b = scanner.nextInt();
            } while (a < 0 || b < 0);
            System.out.println("Result is: " + (a + b));
        }
    }
}
    //old
    //System.out.println(args.length);
    //System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));}
   //System.exit(0);

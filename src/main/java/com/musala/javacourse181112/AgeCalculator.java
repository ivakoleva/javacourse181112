package com.musala.javacourse181112;

import java.util.Scanner;

/**
 * zadacha:
 * program prameters, supplied by user:
 * person age in years
 * years to add to age
 * program flow:
 * when starting program print two numbers
 * then ask the numbers and print to standars output
 * then exit
 * distribute to end user (push to github)
 * <p>
 * zadacha v2:
 * put into effect multiple program arguments support (unlimited number)
 * assume and rely on user  input (int values)
 * sum all of the parameters, then print to output (use while or do while)
 * ** Bonus - do input input validations - natural numbers only; exit(1) if otherwise
 */
// great, using javadoc comment as well
public class AgeCalculator {

    public static void main(final String[] args) throws InterruptedException {
        int age, br = 0, n, years = 0;

        final Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("How many times do you want to add years?");
        n = input.nextInt();

        while (br < n) {
            System.out.println("Enter how many years you want to add");
            years += input.nextInt();
            br++;
            //Thread.sleep(100);
        }

        System.out.println("In " + years + " years you will be " + (age + years) + " old");
        System.exit(0);
    }
}
     /*   int age =19;
        int yearstoadd=25;
        int newage;
        System.out.println("Age = "+age);
        System.out.println("Added years ="+yearstoadd);
        newage = age + yearstoadd;
        System.out.println("The new age is ="+newage);*/

package com.musala.javacourse181112.tasks;
//import java.util.Scanner;


public class FutureAgeCalculatorV2 {
    public static void main(String[] args)  {
    System.out.println("Welcome!");

        int futureAge = 0;
        int dataInput = args.length;
        dataInput--;

        do {
            futureAge = futureAge + Integer.parseInt(args [dataInput] );
            dataInput--;
        }   while(dataInput != -1);

        System.out.println("Your future age is " + futureAge);


    /*System.out.println("What is your current age?");
    Scanner scanner1 = new Scanner(System.in);
    String currentAge = scanner1.nextLine();

    System.out.println("How much you want to add to your age?");
    Scanner scanner2 = new Scanner(System.in);
    String addedAge = scanner1.nextLine();*/

       // int counter = 0;
      //  int age = 0;

       // do {
       //     int user = Integer.parseInt(args[counter++]);
        //    age = age + user;

            //Thread.sleep(1000 * 2);
      //  } while (counter < args.length);
    //    System.out.println("Your future age is: " + (age) );

       // int counter = 0;
        //int age = 0;

        /*do {
            int user = Integer.parseInt(args[counter++]);
            age = age + user;
        } while (counter < args.length);
        System.out.println("Future age calculated: " + (age)); */

        //final int age = Integer.parseInt(args[0]);
    //final int yearToAdd = Integer.parseInt(args[1]);

    }

}

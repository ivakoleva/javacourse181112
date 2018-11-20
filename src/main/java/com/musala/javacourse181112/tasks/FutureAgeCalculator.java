package com.musala.javacourse181112.tasks;
import  java.util.*;

public class FutureAgeCalculator {
    public static void main(final String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int exitProgram;*/
         do{
             /*System.out.println("Type 1 if you want to exit, type any other key and enter to continue");
             exitProgram = scanner.nextInt();*/
             inputYears();

        }while(true);

    }
    public static void inputYears(){
        System.out.println("Enter size of ages array ");
        Scanner scanner = new Scanner(System.in);
        int quantityOfAges = scanner.nextInt();
        System.out.println("Enter size of added years array ");
        int quantityOfYears = scanner.nextInt();


        final int[] ages = new int[quantityOfAges];
        final int[] yearsToAdd = new int[quantityOfYears];
        int sum = 0;

        System.out.println("Please enter ages ");
        for (int age: ages)
        {
            age += scanner.nextInt();
            sum += age;
        }
        System.out.println("Please enter years to add sum with the ages ");
        for (int year: yearsToAdd)
        {
            year += scanner.nextInt();
            sum += year;
        }

        System.out.println(sum);
       }



}

package com.musala.javacourse181112.tasks;


import java.util.Scanner;


public class FutureAgeCalc {

    public static int age = 0;
    public static int i = 0;

    public static void main(String[] args) {
//        int age = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
//        System.out.println("FutureAgeCal age calculated: " + age);
        do {
            age += Integer.parseInt(args[i]);
            i++;
//                    System.out.println("Future age is:" +age);
        } while (args.length > i);
        System.out.println("Future age is:" + age);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Въведете възраст: ");
//        int age = sc.nextInt();
//        System.out.println("Въведете изминали години: ");
//        int addAge = sc.nextInt();
//        int ageAfter = age + addAge;
//        System.out.println("Годините на човека са :" + ageAfter);
//        Integer.
        System.exit(0);
    }

}
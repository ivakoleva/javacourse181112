package com.musala.javacourse181112;


import java.util.Scanner;


public class ageCalc {


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете възраст: ");
        int age = sc.nextInt();
        System.out.println("Въведете изминали години: ");
        int addAge = sc.nextInt();
        int ageAfter = age + addAge;
        System.out.println("Годините на човека са :" + ageAfter);
//        Integer.

    }

}
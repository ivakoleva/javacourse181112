package com.musala.javacourse181112;

import java.util.Scanner;
import java.lang.String;
public class AgeCalculator {

    public static void main(String[] args) {
       // AgeCalc1();
        //AgeCalc2(args);
        AgeCalc3(args);
        //System.out.println(0>>>1);
    }
    private static void AgeCalc1(){
        int age, years;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        age=scanner.nextInt();
        System.out.print("Enter time period in years:");
        years=scanner.nextInt();
        System.out.println("After "+years+" years you will be "+(age+years)+" old.");
    }
    private static void AgeCalc2(String[] args){
        int age=Integer.parseInt(args[0]),years=Integer.parseInt(args[1]);
        System.out.println("New age="+(age+years));
    }
    private static void AgeCalc3(String[] args){
        int age=0,years=0;
        for(int i=0;i<args[0].length();i++)
        {
            age+=(args[0].charAt(i)-'0');
            age*=10;
        }
        for(int i=0;i<args[1].length();i++)
        {
            years+=(args[1].charAt(i)-'0');
            years*=10;
        }
        age/=10;
        years/=10;
        System.out.println("New age="+(age+years));
        System.gc();
        System.exit(0);
    }
}

package com.musala.javacourse181112.basics;
import java.util.Scanner;
public class futureAgeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age=0;

        int  sum=0;
        System.out.println("Enter limiter: ");
        int limiter=input.nextInt();
        while (age!=limiter){

            age++;
            sum =age+sum;

        }
        System.out.println("Thev sum of all age :" + sum);
    }

}

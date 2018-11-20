package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class FutureAgeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age=0;
        int addYears=0;
System.out.println("Enter your age: ");
age=input.nextInt();
do{
    System.out.println("Enter years you want to add to your age(Enter 0 to stop the app): ");
    addYears=input.nextInt();
    age+=addYears;

}
while(age<100||addYears!=0);
System.out.println("Your future age is "+age);

System.exit(0);

    }

}

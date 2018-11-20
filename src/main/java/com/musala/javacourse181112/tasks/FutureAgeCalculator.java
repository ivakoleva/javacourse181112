package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class FutureAgeCalculator {
   public static Scanner INPUT=new Scanner(System.in);
    public static void main(String[] args) {

        int age=0;
        int addYears=0;
System.out.println("Enter your age: ");
age=enterAge();
do{
    System.out.println("Enter years you want to add to your age(Enter 0 to stop the app): ");
    addYears=enterAge();
    age+=addYears;

}
while(addYears!=0);
System.out.println("Your future age is "+age);

System.exit(0);

    }
    private static int enterAge() {
        String in = null;
        in = INPUT.next();
        if (in.contains(".")) {
            System.exit(1);

        }
            return Integer.parseInt(in);

    }

}

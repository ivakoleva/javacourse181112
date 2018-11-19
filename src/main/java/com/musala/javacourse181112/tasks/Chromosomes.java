package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.basics.Gender;

import java.util.Scanner;

public class Chromosomes {
//public static final String MALE_CHROMOSOMES="XY";
//    public static final String FEMALE_CHROMOSOMES="XX";
    public static void main( final String[] args) {
        Gender gender;
        if(args[0].equals("female")){
            gender=Gender.FEMALE;
        }
        else{
            gender=Gender.MALE;
        }
switch (gender){
    case MALE:
        System.out.println("XY");
        break;
    case FEMALE:
        System.out.println("XX");
        break;
        default:
            System.out.println("Error");
            break;

}









/*
        Scanner input=new Scanner(System.in);
        String gender;
        System.out.println("Enter gender male or female");
        gender=input.nextLine();

        switch(gender.toLowerCase()){
            case "male":
                System.out.println(MALE_CHROMOSOMES);
                break;
            case "female":
                System.out.println(FEMALE_CHROMOSOMES);
                break;
                default:
                    System.out.println("Error");
                    break;


        }

//letter by letter
        switch(gender){
            case "male":
                System.out.println("Y");

            case "female":
                System.out.println("X");
                if("male".equalsIgnoreCase(gender))
                    break;

            default:
                System.out.println("X");



        }
*/




    }
}

package com.musala.javacourse181112.tasks.paw_inc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalCenterManager {
    private static List<CleansingCenter> cleansingCenterList = new ArrayList<>();
    private static List<AdoptionCenter> adoptionCenterList = new ArrayList<>();

    static void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        cleansingCenterList.add(cleansingCenter);
    }

    static void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        adoptionCenterList.add(adoptionCenter);
    }

    static void registerDog(String name, int age, int learnedCommands, String adoptionCenterName, String tag) {
        System.out.println("Please choose an Adoption Center: ");
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            System.out.println(adoptionCenterList.get(i).getName());
        }
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            if (adoptionCenterList.get(i).getName() == tag) {

            }
        }
    }

    static void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {

    }


    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        String corespondance = in.nextLine();

        switch (BasicEnums.valueOf(corespondance)) {
            case REGISTER_ADOPTION_CENTER:
                registerAdoptionCenter(in.nextLine());
                break;
            case REGISTER_CLEANSING_CENTER:
                registerCleansingCenter(in.nextLine());
                break;
            case REGISTER_CAT:
                registerCat(in.nextLine(), in.nextInt(), in.nextInt(), in.nextLine());
                break;
            case REGISTER_DOG:
                registerDog(in.nextLine(), in.nextInt(), in.nextInt(), in.nextLine(), in.nextLine());
                break;
        }

    }
}

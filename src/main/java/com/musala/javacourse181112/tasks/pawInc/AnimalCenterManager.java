package com.musala.javacourse181112.tasks.pawInc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalCenterManager {
    private static List<CleansingCenter> cleansingCenterList = new ArrayList<>();
    private static List<AdoptionCenter> adoptionCenterList = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    private static void menu() {

        String correspondence = in.nextLine();
        String[] result = correspondence.split(" | ");

        switch (CommandsEnums.fromString(result[0])) {
            case REGISTER_ADOPTION_CENTER:
                registerAdoptionCenter(result[2]);
            case REGISTER_CLEANSING_CENTER:
                registerCleansingCenter(result[2]);
            case REGISTER_CAT:
                registerCat(result[2], Integer.parseInt(result[4]), Integer.parseInt(result[6]), result[8]);
            case REGISTER_DOG:
                registerDog(result[2], Integer.parseInt(result[4]), Integer.parseInt(result[6]), result[8]);
            case ADOPT:
            case CLEANSE:
            case SEND_FOR_CLEANSING:
            case PRINT_STATISTICS:
            case PAW_PAW_PAWAH:
                break;
        }
    }

    private static void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        cleansingCenterList.add(cleansingCenter);
        menu();
    }

    private static void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        adoptionCenterList.add(adoptionCenter);
        menu();
    }

    private static void registerDog(String name, int age, int amountOfCommands, String tag) {
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            if (adoptionCenterList.get(i).getName().equals(tag)) {
                Dog dog1 = new Dog(name, age, amountOfCommands, tag);
                adoptionCenterList.get(i).addDog(dog1);
            }
        }
        menu();
    }

    private static void registerCat(String name, int age, int intelligenceCoefficient, String tag) {

        for (int i = 0; i < adoptionCenterList.size(); i++) {
            if (adoptionCenterList.get(i).getName().equals(tag)) {
                Cat cat1 = new Cat(name, age, intelligenceCoefficient, tag);
                adoptionCenterList.get(i).addCat(cat1);
            }
        }
        menu();
    }

    private static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            for (int j = 0; j < cleansingCenterList.size(); j++) {
                if (adoptionCenterList.get(i).getName().equals(adoptionCenterName)
                        && cleansingCenterList.get(i).getName().equals(cleansingCenterName)) {
                    for (int k = 0; k < adoptionCenterList.get(i).getCat().size(); k++) {
                        if (adoptionCenterList.get(i).getCat().get(k).equals(1)) {

                        }
                    }
                }
            }

        }
    }

    private static void cleanse(String cleansingCenterName) {

    }

    private static void adopt(String adoptionCenterName) {

    }

    private static void printStatistics() {

    }


    public static void main(final String[] args) {
        menu();

    }
}

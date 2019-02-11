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
                adopt(result[2]);
            case CLEANSE:
                cleanse(result[2]);
            case SEND_FOR_CLEANSING:
                sendForCleansing(result[2], result[4]);
            case PAW_PAW_PAWAH:
                printStatistics();
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
                adoptionCenterList.get(i).addDogs(dog1);
            } else {
                System.out.println("No such center");
            }
        }
        menu();
    }

    private static void registerCat(String name, int age, int intelligenceCoefficient, String tag) {

        for (int i = 0; i < adoptionCenterList.size(); i++) {
            if (adoptionCenterList.get(i).getName().equals(tag)) {
                Cat cat1 = new Cat(name, age, intelligenceCoefficient, tag);
                adoptionCenterList.get(i).addCats(cat1);
            } else {
                System.out.println("No such center");
            }
        }
        menu();
    }

    private static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            for (int j = 0; j < cleansingCenterList.size(); j++) {
                if (adoptionCenterList.get(i).getName().equals(adoptionCenterName)
                        && cleansingCenterList.get(i).getName().equals(cleansingCenterName)) {
                    for (int k = 0; k < adoptionCenterList.get(i).getCats().size(); k++) {
                        if (adoptionCenterList.get(i).getCats().get(k).getCleansingStatus().equals(false)) {
                            cleansingCenterList.get(j).addCats(adoptionCenterList.get(i).getCats().get(k));
                            adoptionCenterList.get(i).getCats().remove(k);
                        }
                    }
                } else {
                    System.out.println("There is no such center.");
                }
            }

        }
        menu();
    }

    private static void cleanse(String cleansingCenterName) {
        for (int j = 0; j < cleansingCenterList; j++) {
            if (cleansingCenterList.get(j).getName().equals(cleansingCenterName)) {
                for (int i = 0; i < cleansingCenterList.get(j).getCats().size(); i++) {
                    cleansingCenterList.get(j).getCats().get(i).setCleansingStatus(true);
                    for (int k = 0; k < adoptionCenterList.size(); k++) {
                        if (adoptionCenterList.get(k).getName().equals(cleansingCenterList.get(j).getCats().get(i).getTag())) {
                            adoptionCenterList.get(j).addCleansedCats(cleansingCenterList.get(j).getCats.get(i));
                        }
                    }
                }
            }
        }
    }

    private static void adopt(String adoptionCenterName) {

    }

    private static void printStatistics() {

    }


    public static void main(final String[] args) {
        menu();

    }
}

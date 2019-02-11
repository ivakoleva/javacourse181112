package com.musala.javacourse181112.tasks.pawInc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalCenterManager {
    private static List<CleansingCenter> cleansingCenterList = new ArrayList<>();
    private static List<AdoptionCenter> adoptionCenterList = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    static void menu() {

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


    static void registerCleansingCenter(String name) {
        CleansingCenter cleansingCenter = new CleansingCenter(name);
        cleansingCenterList.add(cleansingCenter);
        menu();
    }

    static void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name);
        adoptionCenterList.add(adoptionCenter);
        menu();
    }

    static void registerDog(String name, int age, int amountOfCommands, String tag) {
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            if (adoptionCenterList.get(i).getName().equals(tag)) {
                Dog dog1 = new Dog(name, age, amountOfCommands, tag);
                adoptionCenterList.get(i).addDogs(dog1);
            } else {
                System.out.println("4No such center");
            }
        }
        menu();
    }

    static void registerCat(String name, int age, int intelligenceCoefficient, String tag) {

        for (int i = 0; i < adoptionCenterList.size(); i++) {
            if (adoptionCenterList.get(i).getName().equals(tag)) {
                Cat cat1 = new Cat(name, age, intelligenceCoefficient, tag);
                adoptionCenterList.get(i).addCats(cat1);
            } else {
                System.out.println("3No such center");
            }
        }
        menu();
    }

    static void adopt(String name) {
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            if (adoptionCenterList.get(i).getName().equals(name)) {
                for (int j = 0; j < adoptionCenterList.get(i).getCats().size(); j++) {
                    if (adoptionCenterList.get(i).getCats().get(j).getCleansingStatus().equals(true)) {
                        adoptionCenterList.get(i).addAdoptedCats(adoptionCenterList.get(i).getCats().get(j));
                        adoptionCenterList.get(i).getCats().remove(j);
                    }
                }
            }
        }
    }

    static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            for (int j = 0; j < cleansingCenterList.size(); j++) {
                if (adoptionCenterList.get(i).getName().equals(adoptionCenterName)
                        && cleansingCenterList.get(j).getName().equals(cleansingCenterName)) {
                    for (int k = 0; k < adoptionCenterList.get(i).getCats().size(); k++) {
                        if (adoptionCenterList.get(i).getCats().get(k).getCleansingStatus().equals(false)) {
                            cleansingCenterList.get(j).addCats(adoptionCenterList.get(i).getCats().get(k));
                            adoptionCenterList.get(i).getCats().remove(k);
                        }
                    }
                    for (int k = 0; k < adoptionCenterList.get(i).getDogs().size(); k++) {
                        if (adoptionCenterList.get(i).getDogs().get(k).getCleansingStatus().equals(false)) {
                            cleansingCenterList.get(j).addDogs(adoptionCenterList.get(i).getDogs().get(k));
                            adoptionCenterList.get(i).getDogs().remove(k);
                        }
                    }
                } else {
                    System.out.println("1There is no such Center.");
                }
            }

        }
        menu();
    }

    static void cleanse(String cleansingCenterName) {
        for (int j = 0; j < cleansingCenterList.size(); j++) {
            if (cleansingCenterList.get(j).getName().equals(cleansingCenterName)) {
                for (int i = 0; i < cleansingCenterList.get(j).getCats().size(); i++) {
                    cleansingCenterList.get(j).getCats().get(i).setCleansingStatus(true);
                    for (int k = 0; k < adoptionCenterList.size(); k++) {
                        if (adoptionCenterList.get(k).getName().equals(cleansingCenterList.get(j).getCats().get(i).getTag())) {
                            cleansingCenterList.get(j).addCleansedCats(cleansingCenterList.get(j).getCats().get(i));
                            adoptionCenterList.get(k).addCats(cleansingCenterList.get(j).getCats().get(i));
                            cleansingCenterList.get(j).getCats().remove(i);
                        }
                    }
                }
                for (int i = 0; i < cleansingCenterList.get(j).getDogs().size(); i++) {
                    cleansingCenterList.get(j).getDogs().get(i).setCleansingStatus(true);
                    for (int k = 0; k < adoptionCenterList.size(); k++) {
                        if (adoptionCenterList.get(k).getName().equals(cleansingCenterList.get(j).getDogs().get(i).getTag())) {
                            cleansingCenterList.get(j).addCleansedDogs(cleansingCenterList.get(j).getDogs().get(i));
                            adoptionCenterList.get(k).addDogs(cleansingCenterList.get(j).getDogs().get(i));
                            cleansingCenterList.get(j).getDogs().remove(i);
                        }
                    }
                }
            } else {
                System.out.println("2There is no such Center");
            }
            menu();
        }
    }

    private static void printStatistics() {
        int a, b;
        a = b = 0;
        System.out.println("Paw Incorporative Regular Statistics");
        System.out.println("Adoption centers: " + adoptionCenterList.size());
        System.out.println("Cleansing centers: " + cleansingCenterList.size());
        System.out.print("Adopted animals: ");
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            int j = 0;
            while (j < adoptionCenterList.get(i).getAdoptedCats().size()) {
                System.out.print(adoptionCenterList.get(i).getAdoptedCats().get(j).getName() + ", ");
                j++;
            }
            j = 0;
            while (j < adoptionCenterList.get(i).getAdoptedDogs().size()) {
                System.out.print(adoptionCenterList.get(i).getAdoptedDogs().get(j).getName() + ", ");
                j++;
            }
        }
        System.out.println(";");
        System.out.print("Cleansed animals: ");
        for (int i = 0; i < cleansingCenterList.size(); i++) {
            for (int j = 0; j < cleansingCenterList.get(i).getCleansedCats().size(); j++) {
                System.out.print(cleansingCenterList.get(i).getCleansedCats().get(j).getName() + ", ");
            }
            for (int j = 0; j < cleansingCenterList.get(i).getCleansedDogs().size(); j++) {
                System.out.print(cleansingCenterList.get(i).getCleansedDogs().get(j).getName() + ", ");
            }
        }
        System.out.println();
        System.out.print("Animals awaiting adoption: ");
        for (int i = 0; i < adoptionCenterList.size(); i++) {
            for (int j = 0; j < adoptionCenterList.get(i).getCats().size(); j++) {
                if (adoptionCenterList.get(i).getCats().get(j).getCleansingStatus().equals(true)) {
                    a++;
                }
            }
            for (int j = 0; j < adoptionCenterList.get(i).getDogs().size(); j++) {
                if (adoptionCenterList.get(i).getDogs().get(j).getCleansingStatus().equals(true)) {
                    a++;
                }
            }

        }
        System.out.println(a);
        System.out.print("Animals awaiting cleansing: ");
        for (int i = 0; i < cleansingCenterList.size(); i++) {
            for (int j = 0; j < cleansingCenterList.get(i).getCats().size(); j++) {
                if (cleansingCenterList.get(i).getCats().get(j).getCleansingStatus().equals(false)) {
                    b++;
                }
            }
            for (int j = 0; j < cleansingCenterList.get(i).getDogs().size(); j++) {
                if (cleansingCenterList.get(i).getDogs().get(j).getCleansingStatus().equals(false)) {
                    b++;
                }
            }
        }
        System.out.println(b);
    }



    public static void main(final String[] args) {
        menu();

    }
}


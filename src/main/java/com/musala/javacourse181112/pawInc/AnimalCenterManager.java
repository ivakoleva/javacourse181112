package com.musala.javacourse181112.pawInc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AnimalCenterManager {
    private static List<AdoptionCenter> ListAdoptionCenters = new ArrayList<>();
    private static List<CleansingCenter> ListCleansingCenters = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    static void menu() {
        String correspondence = scan.nextLine();
        String[] result = correspondence.split(" | ");
        switch (correspondence) {
            case "Paw Paw Pawah":
                printStats();
                break;
        }
        switch (BasicCommands.fromString(result[0].replace(" ", "_"))) {
            case REGISTER_ADOPTION_CENTER:
                registerAdoptionCenter(result[2]);
                break;
            case REGISTER_CLEANSING_CENTER:
                registerCleansingCenter(result[2]);
                break;
            case REGISTER_CAT:
                registerCat(result[2], Integer.parseInt(result[4]), Integer.parseInt(result[6]), result[8]);
                break;
            case REGISTER_DOG:
                registerDog(result[2], Integer.parseInt(result[4]), Integer.parseInt(result[6]), result[8]);
                break;
            case SEND_FOR_CLEANSE:
                sendForCleansing(result[2], result[4]);
                break;
            case CLEANSE:
                cleanse(result[2]);
                break;
            case ADOPT:
                adopt(result[2]);
                break;

        }

    }

    static void registerCleansingCenter(String name) {
        ListCleansingCenters.add(new CleansingCenter(name));
        menu();
    }

    static void registerAdoptionCenter(String name) {

        ListAdoptionCenters.add(new AdoptionCenter(name));

        menu();
    }

    static void registerDog(String name, int age, int Commands, String tag) {
        try {
            for (int i = 0; i < ListAdoptionCenters.size(); i++) {
                if (ListAdoptionCenters.get(i).getName().equals(tag)) {
                    ListAdoptionCenters.get(i).addDogs(new Dog(name, age, Commands, tag));
                }
            }
        } catch (Exception a) {
            System.out.println("There is no such center");
        }
        menu();
    }

    static void registerCat(String name, int age, int IQ, String tag) {
        try {
            for (int i = 0; i < ListAdoptionCenters.size(); i++) {
                if (ListAdoptionCenters.get(i).getName().equals(tag)) {
                    ListAdoptionCenters.get(i).addCats(new Cat(name, age, IQ, tag));
                }
            }
        } catch (Exception a) {
            System.out.println("There is no such center");
        }
        menu();
    }

    static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        try {
            for (int i = 0; i < ListAdoptionCenters.size(); i++) {
                for (int j = 0; j < ListCleansingCenters.size(); j++) {
                    if (ListAdoptionCenters.get(i).getName().equals(adoptionCenterName) && ListCleansingCenters.get(j).getName().equals(cleansingCenterName)) {
                        for (int k = 0; k < ListAdoptionCenters.get(i).getCats().size(); k++) {
                            if (ListAdoptionCenters.get(i).getCats().get(k).getCleansingStatus().equals(false)) {
                                ListCleansingCenters.get(j).addCats(ListAdoptionCenters.get(i).getCats().get(k));
                                ListAdoptionCenters.get(i).getCats().remove(k);
                            }
                        }
                        for (int k = 0; k < ListAdoptionCenters.get(i).getDogs().size(); k++) {
                            if (ListAdoptionCenters.get(i).getDogs().get(k).getCleansingStatus().equals(false)) {
                                ListCleansingCenters.get(j).addDogs(ListAdoptionCenters.get(i).getDogs().get(k));
                                ListAdoptionCenters.get(i).getDogs().remove(k);
                            }
                        }
                    }
                }
            }
        } catch (Exception a) {
            System.out.println("There is no such center");
        }
        menu();
    }

    static void cleanse(String cleansingCenterName) {
        try {
            for (int j = 0; j < ListCleansingCenters.size(); j++) {
                if (ListCleansingCenters.get(j).getName().equals(cleansingCenterName)) {
                    for (int i = 0; i < ListCleansingCenters.get(j).getCats().size(); i++) {
                        if(ListCleansingCenters.get(j).getCats().size()>0){
                        ListCleansingCenters.get(j).getCats().get(i).setCleansingStatus(true);
                        for (int k = 0; k < ListAdoptionCenters.size(); k++) {
                            if (ListAdoptionCenters.get(k).getName().equals(ListCleansingCenters.get(j).getCats().get(i).getTag())) {
                                ListCleansingCenters.get(j).addCleansedCats(ListCleansingCenters.get(j).getCats().get(i));
                                ListAdoptionCenters.get(k).addCats(ListCleansingCenters.get(j).getCats().get(i));
                                ListCleansingCenters.get(j).getCats().remove(i);
                            }
                        }
                    }}
                    for (int i = 0; i < ListCleansingCenters.get(j).getDogs().size(); i++) {
                        if (ListCleansingCenters.get(j).getDogs().size()>0){
                            ListCleansingCenters.get(j).getDogs().get(i).setCleansingStatus(true);
                            for (int k = 0; k < ListAdoptionCenters.size(); k++) {
                                if (ListAdoptionCenters.get(k).getName().equals(ListCleansingCenters.get(j).getDogs().get(i).getTag())) {
                                    ListCleansingCenters.get(j).addCleansedDogs(ListCleansingCenters.get(j).getDogs().get(i));
                                    ListAdoptionCenters.get(k).addDogs(ListCleansingCenters.get(j).getDogs().get(i));
                                    ListCleansingCenters.get(j).getDogs().remove(i);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception a) {
            System.out.println("There is no such center");
        }
        menu();
    }

    static void adopt(String name) {
        try {
            for (int i = 0; i < ListAdoptionCenters.size(); i++) {
                if (ListAdoptionCenters.get(i).getName().equals(name)) {
                    for (int j = 0; j < ListAdoptionCenters.get(i).getCats().size(); j++) {
                        if (ListAdoptionCenters.get(i).getCats().get(j).getCleansingStatus().equals(true)) {
                            ListAdoptionCenters.get(i).addAdoptedCats(ListAdoptionCenters.get(i).getCats().get(j));
                            ListAdoptionCenters.get(i).getCats().remove(j);
                        }

                    }
                    for (int j = 0; j < ListAdoptionCenters.get(i).getDogs().size(); j++) {
                        if (ListAdoptionCenters.get(i).getDogs().get(j).getCleansingStatus().equals(true)) {
                            ListAdoptionCenters.get(i).addAdoptedDogs(ListAdoptionCenters.get(i).getDogs().get(j));
                            ListAdoptionCenters.get(i).getDogs().remove(j);
                        }

                    }

                }
            }
        } catch (Exception a) {
            System.out.println("There is no such center");
        }
        menu();
    }

    static void printStats() {
        int a, b;
        a = b = 0;
        System.out.println("Paw Incorporative Regular Statistics");
        System.out.println("Adoption Centers: " + ListAdoptionCenters.size());
        System.out.println("Cleansing Centers: " + ListCleansingCenters.size());
        System.out.print("Adopted animals: ");
        int j = 0;
        for (int i = 0; i < ListAdoptionCenters.size(); i++) {

            while (j < ListAdoptionCenters.get(i).getAdoptedCats().size()) {
                System.out.print(ListAdoptionCenters.get(i).getAdoptedCats().get(j).getName());
                if(ListAdoptionCenters.get(ListAdoptionCenters.size()-1).getAdoptedDogs().size()!=0 || i<ListAdoptionCenters.size() - 1 || j<ListAdoptionCenters.get(i).getAdoptedCats().size() - 1){
                    System.out.print(", ");
                }
                j++;
            }
            j=0;
            while (j < ListAdoptionCenters.get(i).getAdoptedDogs().size()) {
                System.out.print(ListAdoptionCenters.get(i).getAdoptedDogs().get(j).getName());
                j++;
                if(i<ListAdoptionCenters.size() - 1 || j<ListAdoptionCenters.get(i).getAdoptedDogs().size() - 1){
                    System.out.print(", ");
                }

            }

        }
        j=0;
        for (int i = 0; i <ListAdoptionCenters.size() ; i++) {
            if(ListAdoptionCenters.get(i).getAdoptedCats().size()!=0 ||ListAdoptionCenters.get(i).getAdoptedDogs().size()!=0){
                j++;
            }
        }
        if(j==0){
            System.out.print(j);
        }
        System.out.println();
        System.out.print("Cleansed animals: ");
        for (int i = 0; i < ListCleansingCenters.size(); i++) {
            for (j = 0; j < ListCleansingCenters.get(i).getCleansedCats().size(); j++) {
                System.out.print(ListCleansingCenters.get(i).getCleansedCats().get(j).getName() + ", ");
            }
            for (j = 0; j < ListCleansingCenters.get(i).getCleansedDogs().size(); j++) {
                System.out.print(ListCleansingCenters.get(i).getCleansedDogs().get(j).getName() + ", ");
            }
        }
        System.out.println();
        System.out.print("Animals awaiting adoption: ");
        for (int i = 0; i < ListAdoptionCenters.size(); i++) {
            for (j = 0; j < ListAdoptionCenters.get(i).getCats().size(); j++) {
                if (ListAdoptionCenters.get(i).getCats().get(j).getCleansingStatus().equals(true)) {
                    a++;
                }
            }
            for (j = 0; j < ListAdoptionCenters.get(i).getDogs().size(); j++) {
                if (ListAdoptionCenters.get(i).getDogs().get(j).getCleansingStatus().equals(true)) {
                    a++;
                }
            }

        }
        System.out.println(a);
        System.out.print("Animals awaiting cleansing: ");
        for (int i = 0; i < ListCleansingCenters.size(); i++) {
            for (j = 0; j < ListCleansingCenters.get(i).getCats().size(); j++) {
                if (ListCleansingCenters.get(i).getCats().get(j).getCleansingStatus().equals(false)) {
                    b++;
                }
            }
            for (j = 0; j < ListCleansingCenters.get(i).getDogs().size(); j++) {
                if (ListCleansingCenters.get(i).getDogs().get(j).getCleansingStatus().equals(false)) {
                    b++;
                }
            }
        }
        System.out.println(b);
        System.exit(0);
    }

    public static void main(String[] args) {
        menu();
    }
}

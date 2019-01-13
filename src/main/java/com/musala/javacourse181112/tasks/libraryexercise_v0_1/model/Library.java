package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static String name;
    private static List<Person> employees = new ArrayList<>();
    private static List<Person> clients = new ArrayList<>();
    private static List<Item> itemsInventory = new ArrayList<>();

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Library.name = name;
    }

    public static List<Person> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Person> employees) {
        Library.employees = employees;
    }

    public static List<Person> getClients() {
        return clients;
    }

    public static void setClients(List<Person> clients) {
        Library.clients = clients;
    }

    public static List<Item> getItemsInventory() {
        return itemsInventory;
    }

    public static void setItemsInventory(List<Item> itemsInventory) {
        Library.itemsInventory = itemsInventory;
    }
}

package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.util.LinkedList;
import java.util.List;

/*
 **** library organization itself
 ***** name
 ***** employees
 ***** clients
 ***** items inventory
 */
public class Library {
    private String name;
    private List<Employee> employeesList = new LinkedList<>();
    private List<Client> clientsList = new LinkedList<>();
    private List<Item> inventoryItemsList = new LinkedList<>();
}

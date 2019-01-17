package com.musala.javacourse181112.tasks.oop.libraryexercise_v0_1.model;

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
    private String address;

    private List<Person> employeesList = new LinkedList<>();
    private List<Inventory> inventoryItemsList = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Person> employeesList) {
        this.employeesList = employeesList;
    }

    public List<Inventory> getInventoryItemsList() {
        return inventoryItemsList;
    }

    public void setInventoryItemsList(List<Inventory> inventoryItemsList) {
        this.inventoryItemsList = inventoryItemsList;
    }
}

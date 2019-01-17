package com.musala.javacourse181112.tasks.oop.libraryexercise_v0_1.model;

import java.time.LocalDate;

public class RentItem {
    private Library library;
    private Inventory inventoryItem;
    private Person person;
    private LocalDate hireDate;
    private LocalDate returnDate;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Inventory getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(Inventory inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}

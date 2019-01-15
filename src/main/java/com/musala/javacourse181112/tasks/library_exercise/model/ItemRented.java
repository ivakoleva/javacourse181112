package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDateTime;

public class ItemRented {
    private Library library;
    private LocalDateTime rentedSince;
    private LocalDateTime rentedUntil = null;
    private Item item;
    private Person employeeServiced;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public LocalDateTime getRentedSince() {
        return rentedSince;
    }

    public void setRentedSince(LocalDateTime rentedSince) {
        this.rentedSince = rentedSince;
    }

    public LocalDateTime getRentedUntil() {
        return rentedUntil;
    }

    public void setRentedUntil(LocalDateTime rentedUntil) {
        this.rentedUntil = rentedUntil;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Person getEmployeeServiced() {
        return employeeServiced;
    }

    public void setEmployeeServiced(Person employeeServiced) {
        this.employeeServiced = employeeServiced;
    }
}
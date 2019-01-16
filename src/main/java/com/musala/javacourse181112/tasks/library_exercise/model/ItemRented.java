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

    public void setLibrary(final Library library) {
        this.library = library;
    }

    public LocalDateTime getRentedSince() {
        return rentedSince;
    }

    public void setRentedSince(final LocalDateTime rentedSince) {
        this.rentedSince = rentedSince;
    }

    public LocalDateTime getRentedUntil() {
        return rentedUntil;
    }

    public void setRentedUntil(final LocalDateTime rentedUntil) {
        this.rentedUntil = rentedUntil;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(final Item item) {
        this.item = item;
    }

    public Person getEmployeeServiced() {
        return employeeServiced;
    }

    public void setEmployeeServiced(final Person employeeServiced) {
        this.employeeServiced = employeeServiced;
    }
}
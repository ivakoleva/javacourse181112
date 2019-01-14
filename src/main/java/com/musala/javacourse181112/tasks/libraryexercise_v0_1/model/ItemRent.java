package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.time.LocalDate;

public class ItemRent {

    private final static int MAX_DAYS = 30;
    private Item item;
    private LocalDate dateOfHiring;
    private LocalDate returnDate;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    LocalDate getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(LocalDate dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "ItemRent{" +
                "item = " + item.getName() +
                //", person = " + person.getName() +
                ", dateOfHiring = " + dateOfHiring +
                ", returnDate = " + returnDate +
                '}';
    }

    public LocalDate calculateReturnDate() {
        return this.dateOfHiring.plusDays(MAX_DAYS);
    }
}

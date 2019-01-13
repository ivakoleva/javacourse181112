package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.time.LocalDateTime;

public class Loan {
    private int id;
    private Item item;
    private Client client;
    private LocalDateTime dateOfLoan;
    private LocalDateTime dateOfReturn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDateOfLoan() {
        return dateOfLoan;
    }

    public void setDateOfLoan(LocalDateTime dateOfLoan) {
        this.dateOfLoan = dateOfLoan;
    }

    public LocalDateTime getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDateTime dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
}

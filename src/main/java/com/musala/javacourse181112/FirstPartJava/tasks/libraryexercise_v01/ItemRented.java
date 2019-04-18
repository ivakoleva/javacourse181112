package com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01;

import com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01.InventoryItems.Item;

import java.time.LocalDateTime;

public class ItemRented {
    private Item item;
    private Subscription subscription;
    private LocalDateTime rentedAtTime;
    private LocalDateTime rentedUntilTime;


    public ItemRented() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public LocalDateTime getRentedAtTime() {
        return rentedAtTime;
    }

    public void setRentedAtTime(LocalDateTime rentedAtTime) {
        this.rentedAtTime = rentedAtTime;
    }

    public LocalDateTime getRentedUntilTime() {
        return rentedUntilTime;
    }

    public void setRentedUntilTime(LocalDateTime rentedUntilTime) {
        this.rentedUntilTime = rentedUntilTime;
    }
}

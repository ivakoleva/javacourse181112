package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import java.time.LocalDateTime;

public class RentedItem {

    private Item item;
    private LocalDateTime rentedDate;
    private LocalDateTime returnDate;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDateTime getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(LocalDateTime rentedDate) {
        this.rentedDate = rentedDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
}

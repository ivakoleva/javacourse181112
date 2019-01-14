package com.musala.javacourse181112.oop.libraryexercise.model;

import java.time.LocalDate;

public class ItemRent extends BaseEntity {
    private Item item;
    private LocalDate dateOfRent;
    private LocalDate dateOfReturn;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    LocalDate getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(LocalDate dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemRent itemRent = (ItemRent) o;

        if (getId() != null ? !getId().equals(itemRent.getId()) : itemRent.getId() != null) return false;
        if (item != null ? !item.equals(itemRent.item) : itemRent.item != null) return false;
        if (dateOfRent != null ? !dateOfRent.equals(itemRent.dateOfRent) : itemRent.dateOfRent != null) return false;
        return dateOfReturn != null ? dateOfReturn.equals(itemRent.dateOfReturn) : itemRent.dateOfReturn == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (dateOfRent != null ? dateOfRent.hashCode() : 0);
        result = 31 * result + (dateOfReturn != null ? dateOfReturn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ItemRent{" +
                "item = " + item.getName() +
                //", person = " + person.getName() +
                ", dateOfRent = " + dateOfRent +
                ", dateOfReturn = " + dateOfReturn +
                '}';
    }

    // TODO: extract
    public LocalDate calculateReturnDate() {
        return this.dateOfRent.plusDays(Library.MAX_DAYS);
    }
}

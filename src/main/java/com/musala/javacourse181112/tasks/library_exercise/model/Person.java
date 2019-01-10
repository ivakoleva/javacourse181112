package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDate;
import java.util.List;

public class Person {
    Role role;
    String name;
    String id;
    List<Item> rentedItems;
    LocalDate subscribedUntil;

    public Person(Role role) {
        this.role = role;
    }

    public Person(Role role, String name, String id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getRentedItems() {
        return rentedItems;
    }

    public void setRentedItems(List<Item> rentedItems) {
        this.rentedItems = rentedItems;
    }

    public LocalDate getSubscribedUntil() {
        return subscribedUntil;
    }

    public void subscribe() {
        subscribedUntil = subscribedUntil.plusMonths(1L);
    }
}

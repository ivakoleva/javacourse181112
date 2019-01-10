package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private Role role;
    private String name;
    private String id;
    private List<ItemRented> rentedItems;
    private LocalDate subscribedUntil;

    /*public Person(Role role) {
        this.role = role;
    }

    public Person(Role role, String name, String id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }*/

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

    public List<ItemRented> getRentedItems() {
        return rentedItems;
    }

    public void setRentedItems(List<ItemRented> rentedItems) {
        this.rentedItems = rentedItems;
    }

    public LocalDate getSubscribedUntil() {
        return subscribedUntil;
    }

    public void subscribe() {
        subscribedUntil = LocalDate.now().plusMonths(1L);
    }
}

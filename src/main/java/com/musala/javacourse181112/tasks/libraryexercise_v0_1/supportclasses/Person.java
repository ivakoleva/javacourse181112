package com.musala.javacourse181112.tasks.libraryexercise_v0_1.supportclasses;


import java.time.LocalDate;
import java.util.List;

public class Person {
    private String name;
    private Role role;
    private String id;
    private List<ItemsInventory> itemsInInventory;
    private LocalDate subscribedUntil;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ItemsInventory> getItemsInInventory() {
        return itemsInInventory;
    }

    public void setItemsInInventory(List<ItemsInventory> itemsInInventory) {
        this.itemsInInventory = itemsInInventory;
    }

    public LocalDate getSubscribedUntil() {
        return subscribedUntil;
    }

    public void setSubscribedUntil(LocalDate subscribedUntil) {
        this.subscribedUntil = subscribedUntil;
    }

    public void subscribe() {
    }
}


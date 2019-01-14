package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String egn;
    private Roles role;
    private ItemRent itemRent;

    ItemRent getItemRent() {
        return itemRent;
    }

    public void setItemRent(ItemRent itemRent) {
        this.itemRent = itemRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}

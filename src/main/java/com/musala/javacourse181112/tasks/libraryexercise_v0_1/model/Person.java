package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String egn;
    private Roles role;
    private LocalDate returnToDate;
    private List<ItemRent> itemRentList = new ArrayList<>();

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

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public LocalDate getReturnToDate() {
        return returnToDate;
    }

    public void setReturnToDate(LocalDate returnToDate) {
        this.returnToDate = returnToDate;
    }

    public List<ItemRent> getItemRentList() {
        return itemRentList;
    }

    public void setItemRentList(List<ItemRent> itemRentList) {
        this.itemRentList = itemRentList;
    }
}

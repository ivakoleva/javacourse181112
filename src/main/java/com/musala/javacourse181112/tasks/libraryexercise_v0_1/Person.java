package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import java.util.ArrayList;

public class Person {
    private Role role;
    private String name;
    private ArrayList<Item> itemArrayList = new ArrayList<>();

    public Person(Role role, String name, ArrayList<Item> itemArrayList) {
        this.role = role;
        this.name = name;
        this.itemArrayList = itemArrayList;
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

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }
}

package com.musala.javacourse181112.tasks.libraryexercise;

import java.util.ArrayList;

public class Person {

    private Role role;
    private String name;
    private ArrayList<Item> ItemArrayList= new ArrayList<>();

    public Person( Role role, String name){
        this.role = role;
        this.name = name;
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
        return ItemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        ItemArrayList = itemArrayList;
    }
}

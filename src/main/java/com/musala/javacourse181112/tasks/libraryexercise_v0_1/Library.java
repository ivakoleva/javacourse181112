package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import java.util.ArrayList;

public class Library {

    public String name;

    ArrayList<Person> personArrayList;
    ArrayList<Item> itemArrayList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }


}

package com.musala.javacourse181112.tasks.libraryexercise;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Person> personArrayList;
    private ArrayList<Item> itemArrayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public ArrayList<Item> getItemnArrayList() {
        return itemArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }


    public void setItemnArrayList(ArrayList<Item> itemnArrayList) {
        this.itemArrayList = itemnArrayList;
    }

}

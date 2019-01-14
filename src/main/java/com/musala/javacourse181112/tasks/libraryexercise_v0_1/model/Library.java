package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private String address;

    private List<Person> personList = new ArrayList<>();
    private List<Item> itemsList = new ArrayList<>();
    private List<ItemRent> itemRentList = new ArrayList<>();

    public List<ItemRent> getItemRentList() {
        return itemRentList;
    }

    public void setItemRentList(List<ItemRent> itemRentList) {
        this.itemRentList = itemRentList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printPersonList() {
        for (Person person : personList) {
            System.out.println(
                    "name = '" + person.getName() + '\'' +
                            ", egn = '" + person.getEgn() + '\'' +
                            ", role = " + person.getRole() +
                            ", itemRent = " + person.getItemRent().getItem().getName() +
                            ", date of Hiring = " + person.getItemRent().getDateOfHiring() +
                            ", return date = " + person.getItemRent().getReturnDate()
            );
        }
    }
}

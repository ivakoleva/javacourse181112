package com.musala.javacourse181112.oop.libraryexercise.model;

import java.util.List;

public class Library extends BaseEntity {
    public final static int MAX_DAYS = 30;

    private String name;
    private String address;
    private List<Person> personList;
    private List<Item> itemList;
    private List<ItemRent> itemRentList;

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

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<ItemRent> getItemRentList() {
        return itemRentList;
    }

    public void setItemRentList(List<ItemRent> itemRentList) {
        this.itemRentList = itemRentList;
    }

    // TODO: extract
    public void printPersonList() {
        for (Person person : personList) {
            System.out.println(
                    "name = '" + person.getName() + '\'' +
                            ", egn = '" + person.getEgn() + '\'' +
                            ", role = " + person.getRoleSet() //+
                            //", itemRent = " + person.getItemRentSet().getItem().getName() +
                            //", date of Hiring = " + person.getItemRentSet().getDateOfRent() +
                            //", return date = " + person.getItemRentSet().getDateOfReturn()
            );
        }
    }
}

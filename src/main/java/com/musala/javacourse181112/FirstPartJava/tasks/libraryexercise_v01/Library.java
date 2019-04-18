package com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01;

import com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01.InventoryItems.Item;
import com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01.Users.Person;

import java.util.List;
public class Library {
    private String name;
    private List<Person> userList;
    private List<Item> itemList;

    public Library() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getUserList() {
        return userList;
    }

    public void setUserList(List<Person> userList)throws NullPointerException {
        if (userList == null) {
            throw new NullPointerException();
        }
        this.userList = userList;

    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}

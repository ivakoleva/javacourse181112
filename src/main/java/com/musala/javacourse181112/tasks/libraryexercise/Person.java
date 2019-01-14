package com.musala.javacourse181112.tasks.libraryexercise;

import java.util.Map;


public class Person {

    private Role role;
    private String name;
    private Map<Item,Boolean> ItemMap;

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

    public Map<Item, Boolean> getItemMap() {
        return ItemMap;
    }

    public void setItemMap(Map<Item, Boolean> itemMap) {
        ItemMap = itemMap;
    }
}

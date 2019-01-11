package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import java.time.LocalDate;
import java.util.Map;


public class Person {
    private Role role;
    private String name;
    private LocalDate endDate;
    private Map<Item, Boolean> itemBooleanMap;

    /*public Person(Role role, String name) {
        this.role = role;
        this.name = name;
    }
    */

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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

    public Map<Item, Boolean> getItemBooleanMap() {
        return itemBooleanMap;
    }

    public void setItemBooleanMap(Map<Item, Boolean> itemBooleanMap) {
        this.itemBooleanMap = itemBooleanMap;
    }
}

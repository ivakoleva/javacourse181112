package com.musala.javacourse181112.tasks.libraryexercise;

import java.time.LocalDate;
import java.util.Map;

public class Person {

    private Role role;
    private String name;
    private LocalDate endDate;
    private Map<Item, Boolean> itemBooleanMap;

    /* public Person(Role role, String name) {
         this.role = role;
         this.name = name;
     }
 */
    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public Map<Item, Boolean> getItemBooleanMap() {
        return itemBooleanMap;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    public void setItemBooleanMap(Map<Item, Boolean> itemBooleanMap) {
        this.itemBooleanMap = itemBooleanMap;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

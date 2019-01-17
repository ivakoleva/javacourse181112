package com.musala.javacourse181112.tasks.library_exercise.model;

import com.musala.javacourse181112.tasks.library_exercise.service.ItemService;

import java.util.List;

public class Library {
    private String name;
    private List<Item> items;
    private List<Person> people;
    private ItemService itemService;

    public ItemService getItemService() {
        return itemService;
    }

    public void setItemService(final ItemService itemService) {
        assert itemService != null;
        this.itemService = itemService;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        assert name != null;
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(final List<Item> items) {
        assert items != null;
        this.items = items;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(final List<Person> people) {
        assert people != null;
        this.people = people;
    }
}

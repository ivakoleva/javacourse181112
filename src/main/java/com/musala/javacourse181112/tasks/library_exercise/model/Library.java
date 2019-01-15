package com.musala.javacourse181112.tasks.library_exercise.model;

import com.musala.javacourse181112.tasks.library_exercise.service.IssueHandler;

import java.util.List;

public class Library {
    private String name;
    private List<Item> items;
    private List<Person> people;
    private IssueHandler issueHandler;


    public IssueHandler getIssueHandler() {
        return issueHandler;
    }

    public void setIssueHandler(IssueHandler issueHandler) {
        this.issueHandler = issueHandler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}

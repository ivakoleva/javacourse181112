package com.musala.javacourse181112.tasks.libraryexecise_v0_1;

import java.util.List;

class Library {
    private String name;
    private List<Person> employees;
    private List<Person> clients;
    private List<? extends Item> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Person> employees) {
        this.employees = employees;
    }

    public List<Person> getClients() {
        return clients;
    }

    public void setClients(List<Person> clients) {
        this.clients = clients;
    }

    public void setPerson(Person person){
        if(person.getRole()==Role.CLIENT){
            clients.add(person);
        }else if (person.getRole()==Role.EMPLOYEE){
            employees.add(person);
        }
    }

    public List<? extends Item> getItems() {
        return items;
    }

    public void setItems(List<? extends Item> items) {
        this.items = items;
    }
}

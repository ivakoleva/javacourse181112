package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.util.List;

public class Library {
    private String companyName;
    private List<People> peopleList;
    private List<Rentable> rentableList;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public List<Rentable> getRentableList() {
        return rentableList;
    }

    public void setRentableList(List<Rentable> rentableList) {
        this.rentableList = rentableList;
    }


}

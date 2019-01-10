package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;


import java.time.LocalDateTime;
import java.util.List;

public class People {

    private RoleEnum role;

    private List<Rentable> rentablesList;

    private LocalDateTime subscribedOnDate;

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public List<Rentable> getRentablesList() {
        return rentablesList;
    }

    public void setRentablesList(List<Rentable> rentablesList) {
        this.rentablesList = rentablesList;
    }

    public LocalDateTime getSubscribedOnDate() {
        return subscribedOnDate;
    }

    public void setSubscribedOnDate(LocalDateTime subscribedOnDate) {
        this.subscribedOnDate = subscribedOnDate;
    }

    public People(RoleEnum role, List<Rentable> rentablesList, LocalDateTime subscribedOnDate) {
        this.role = role;
        this.rentablesList = rentablesList;
        this.subscribedOnDate = subscribedOnDate;
    }

    public People() {
        role = RoleEnum.CLIENT;
        rentablesList.add(null);
    }
}

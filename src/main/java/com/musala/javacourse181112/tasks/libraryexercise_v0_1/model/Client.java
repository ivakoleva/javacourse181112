package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private static Roles role = Roles.client;
    private List<Loan> loanList = new ArrayList<>();

    public static Roles getRole() {
        return role;
    }

    public static void setRole(Roles role) {
        Client.role = role;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }
}

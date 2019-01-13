package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

public class Employee extends Person {
    private static Roles role = Roles.employee;

    public static Roles getRole() {
        return role;
    }

    public static void setRole(Roles role) {
        Employee.role = role;
    }
}

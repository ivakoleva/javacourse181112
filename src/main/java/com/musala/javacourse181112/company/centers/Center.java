package com.musala.javacourse181112.company.centers;

import com.musala.javacourse181112.company.exceptions.InvalidCenterNameException;

public abstract class Center {

    private String name;

    public Center(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidCenterNameException();
        }
        this.name = name;
    }
}

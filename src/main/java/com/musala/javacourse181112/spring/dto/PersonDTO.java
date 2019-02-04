package com.musala.javacourse181112.spring.dto;

import com.musala.javacourse181112.basics.Gender;

/**
 * Created by Iva Koleva on 31.01.2019
 */
public class PersonDTO {
    private Long id;
    private String name;
    private Gender gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

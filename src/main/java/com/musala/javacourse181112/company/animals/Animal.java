package com.musala.javacourse181112.company.animals;



import com.musala.javacourse181112.company.animals.statuses.CastrateStatus;
import com.musala.javacourse181112.company.animals.statuses.CleansingStatus;
import com.musala.javacourse181112.company.exceptions.InvalidAnimalAgeException;
import com.musala.javacourse181112.company.exceptions.InvalidAnimalNameException;

public abstract class Animal {

    private String name;
    private int age;
    private CleansingStatus cleansingStatus;
    private CastrateStatus castrateStatus;

    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.cleansingStatus = CleansingStatus.Uncleansed;
        this.castrateStatus = CastrateStatus.NonCastrated;
    }

    public CleansingStatus getCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(CleansingStatus cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public CastrateStatus getCastrateStatus() {
        return castrateStatus;
    }

    public void setCastrateStatus(CastrateStatus castrateStatus) {
        this.castrateStatus = castrateStatus;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidAnimalNameException();
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new InvalidAnimalAgeException();
        }
        this.age = age;
    }


}

package com.musala.javacourse181112.ProjectPetko;

public class Animal implements Comparable<Animal> {
    private String name;
    private int age;
    private boolean cleansingStatus;
    private boolean castrationStatus;

    public Animal(String newName, int newAge) {
        setName(newName);
        setAge(newAge);
        setCleansingStatus(false);
        setCastrationStatus(false);
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName () {
        return name;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 40) {
            System.out.println("Age must me a value between 0 and 40!");
        } else {
            age = newAge;
        }
    }

    public int getAge () {
        return age;
    }

    public void setCleansingStatus(boolean newCleansingStatus) {
        cleansingStatus = newCleansingStatus;
    }

    public boolean getCleansingStatus () {
        return cleansingStatus;
    }

    public void setCastrationStatus(boolean newCastrationStatus) {
        castrationStatus = newCastrationStatus;
    }

    public boolean getCastrationStatus () {
        return castrationStatus;
    }

    @Override
    public int compareTo(Animal a) {
        return this.getName().compareTo(a.getName());
    }
}

package com.musala.javacourse181112.tasks.pawIncProject.model.animals;

import com.musala.javacourse181112.tasks.pawIncProject.model.centers.AdoptionCenter;
import com.musala.javacourse181112.tasks.pawIncProject.model.exceptions.InvalidInputException;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Animal {

    private String name;
    private int age;
    private boolean cleansed;
    private boolean castrated;
    private AdoptionCenter adoptionCenter;

    public Animal() {
    }

    public Animal(String name, int age) throws InvalidInputException {
        setName(name);
        setAge(age);
        setCleansed(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidInputException {
        if (name== null) throw new InvalidInputException();
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidInputException {
        if (age < 0) throw new InvalidInputException();
        this.age = age;
    }

    public boolean isCleansed() {
        return cleansed;
    }

    public void setCleansed(boolean cleansed) {
        this.cleansed = cleansed;
    }

    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }

    public boolean isCastrated() {
        return castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public static String animalToString(List<Animal> animalsList) {
        if (animalsList == null || animalsList.size() == 0) {
            return "None";
        }

        final StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, animalsList.size())
                .forEach(i -> stringBuilder.append(animalsList.get(i).getName()).append(", "));
        return stringBuilder.toString();
    }

    /*public static String animalSetToString(Set<Animal> animalSet) {
        if (animalSet == null || animalSet.size() == 0) {
            return "None";
        }

        final StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, animalSet.size())
                .forEach(i -> stringBuilder.append(animalSet..getName()).append(", "));
        return stringBuilder.toString();
    }

*/
}

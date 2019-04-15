package com.musala.javacourse181112.tasks.pawIncProject.model.centers;

import com.musala.javacourse181112.tasks.pawIncProject.model.animals.Animal;
import com.musala.javacourse181112.tasks.pawIncProject.model.exceptions.InvalidInputException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Center {
    private String name;
    private int animalsCount;
    private List<Animal> animalList;
    protected CenterType centerType;
    protected Set<Animal> historyAnimalSet;

    public Center() {

    }

    public Center(String name, int animalsCount) {
        setName(name);
        setAnimalsCount(animalsCount);
        setAnimalList(null);
        setHistoryAnimalSet(new HashSet<>());
    }

    public Center(String name) {
        this.name = name;
        setAnimalsCount(0);
        setAnimalList(null);
        setHistoryAnimalSet(new HashSet<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalsCount() {
        return animalsCount;
    }

    public void setAnimalsCount(int animalsCount) {
        if (animalsCount<0)
            this.animalsCount = 0;
        else {
          this.animalsCount = animalsCount;
        }
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        if (animalList == null){
            animalList = new ArrayList<>();
        }
        this.animalList = animalList;
        animalsCount=animalList.size();
    }

    public void addAnimal(Animal newAnimal) throws InvalidInputException {
        if (newAnimal == null) throw new InvalidInputException();
        this.animalList.add(newAnimal);
        this.animalsCount=animalList.size();
    }

    /*@Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Center{" +
                "name='" + name + '\'' +
                ", animalsCount=" + animalsCount).append(", animalList=");
        animalList.forEach(b::append);
        return b.toString();
    }*/

    public Set<Animal> getHistoryAnimalSet() {
        return historyAnimalSet;
    }

    public void setHistoryAnimalSet(Set<Animal> historyAnimalSet) {
        assert historyAnimalSet != null;
        this.historyAnimalSet = historyAnimalSet;
    }

    public Set<Animal> getAnimalsWithPredicate(Predicate<Animal> predicate){
        List<Animal> newList = new ArrayList<>(historyAnimalSet);
        newList.addAll(animalList);

        return newList.stream().filter(predicate).collect(Collectors.toSet());
    }
}

package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.centers;

import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.animals.Animal;
import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.exceptions.InvalidInputException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CastrationCenter extends Center {

    public static final Predicate<Animal> isCastrated= Animal::isCastrated;
    public static final Predicate<Animal> isNotCastrated= animal -> !animal.isCastrated();


   private Set<Animal> castrateAnimalsHistory;

    public CastrationCenter(String name, int animalsCount) {
        super(name, animalsCount);
        centerType = CenterType.CASTRATION;
        setCastrateAnimalsHistory(new HashSet<>());
    }


    /**
     * Castrates all animals from the given Castration center and
     * returns them to their corresponding Adoption centers.
     * */
    public void onCastrateCommand() {
        final List<Animal> castrationCenter = getAnimalList();
        assert castrationCenter != null;
        if (castrationCenter.isEmpty()) return;

        final List<Animal> forCastrateList = castrationCenter.stream()
                .filter(isNotCastrated)
                .collect(Collectors.toList());

        forCastrateList.forEach(animal -> {
            try {
                animal.getAdoptionCenter().addAnimal(animal);
            } catch (InvalidInputException e) {
                e.printStackTrace();
            }
        });
        castrateAnimalsHistory.addAll(forCastrateList);
        castrationCenter.removeAll(forCastrateList);
    }

    public Set<Animal> getCastrateAnimalsHistory() {
        return castrateAnimalsHistory;
    }

    public void setCastrateAnimalsHistory(Set<Animal> castrateAnimalsHistory) {
        assert castrateAnimalsHistory != null;
        this.castrateAnimalsHistory = castrateAnimalsHistory;
    }

    @Override
    public String toString() {
        return "CastrationCenter{" +
                "castrateAnimalsHistory=" + castrateAnimalsHistory +
                ", centerType=" + centerType +
                '}';
    }

    /*@Override
    public String toString() {
        return "CastrationCenter{" +
                "castrateAnimalsHistory=" + getAnimalList().sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 1;
            }
        }.toString());
    }*/
}

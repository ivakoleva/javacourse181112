package paw.incorporative.Centers;

import paw.incorporative.Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Center {
    private String name;
    private List<Animal> animalList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }
}

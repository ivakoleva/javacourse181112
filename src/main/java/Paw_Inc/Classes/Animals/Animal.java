package Paw_Inc.Classes.Animals;

import Paw_Inc.Classes.Centers.AdoptionCenter;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public abstract class Animal {
    private boolean cleansed;
    private String name;
    private int age;
    protected AdoptionCenter adoptionCenter;


    protected Animal(String name, int age) {
        this.age = age;
        this.name = name;
        this.cleansed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCleansed() {
        return cleansed;
    }

    public void cleanse() {
        cleansed = true;
    }

    public abstract AdoptionCenter getAdoptionCenter();

    public abstract void setAdoptionCenter(AdoptionCenter adoptionCenter);

}

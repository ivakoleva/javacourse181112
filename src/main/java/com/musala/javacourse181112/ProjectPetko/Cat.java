package com.musala.javacourse181112.ProjectPetko;

public class Cat extends Animal {
    private int iq;

    public Cat(String newName, int newAge, int newIq){
        super(newName, newAge);
        setIq(newIq);
    }

    public void setIq(int newIq) {
        if (newIq < 0 || newIq > 300) {
            System.out.println("IQ must be a value between 0 and 300");
        } else {
            iq = newIq;
        }
    }

    public int getIq() {
        return iq;
    }
}
package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.animals;

import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.exceptions.InvalidInputException;

public class Dog extends Animal implements SpecialTalent{
    private int amountOfCommands;


    public Dog(String name, int age,int amountOfCommands) throws InvalidInputException {
        super(name, age);
        setAmountOfCommands(amountOfCommands);
    }
    public Dog(String name, int age) throws InvalidInputException {
        super(name, age);
    }

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(int amountOfCommands) throws InvalidInputException {
        if (amountOfCommands>=0){
            this.amountOfCommands = amountOfCommands;
        }else throw new InvalidInputException();
    }

    @Override
    public int getSpecialTalent() {
        return amountOfCommands;
    }

    @Override
    public void setSpecialTalent(int specialTalent) {
        try {
            setAmountOfCommands(specialTalent);
        } catch (InvalidInputException e) {
            System.err.println("wrong argument in talent Dog");
        }
    }
}

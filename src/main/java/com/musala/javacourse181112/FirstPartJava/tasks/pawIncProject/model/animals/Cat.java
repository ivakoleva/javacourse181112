package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.animals;

import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.exceptions.InvalidInputException;

public class Cat extends Animal implements SpecialTalent{
    private int intelligenceCoef;


    public Cat(String name, int age,int intelligenceCoef) throws InvalidInputException {
       super(name, age);
       setIntelligenceCoef(intelligenceCoef);
    }
    public Cat(String name, int age) throws InvalidInputException {
       super(name, age);
      }

    public int getIntelligenceCoef() {
       return intelligenceCoef;
    }

    public void setIntelligenceCoef(int intelligenceCoef) throws InvalidInputException{
        if (intelligenceCoef>=0){
            this.intelligenceCoef = intelligenceCoef;
        }else throw new InvalidInputException();
    }

    @Override
    public int getSpecialTalent() {
        return intelligenceCoef;
    }

    @Override
    public void setSpecialTalent(int specialTalent) {
        try {
            setIntelligenceCoef(specialTalent);
        } catch (InvalidInputException e) {
            System.err.println("wrong argument in talent cat");
        }
    }
}
package com.musala.javacourse181112.SecondPart.Patterns.DecorationPattern;

public class PeperoniPizza implements PizzaPlate {
    private String pizzaName;

    public PeperoniPizza(String name) {
        this.pizzaName = "PeperoniPizza";
    }

    @Override
    public void createPizza(String component) {
        System.out.println("Add pizzaPlate "+ component +" in: "+ pizzaName);
    }
}

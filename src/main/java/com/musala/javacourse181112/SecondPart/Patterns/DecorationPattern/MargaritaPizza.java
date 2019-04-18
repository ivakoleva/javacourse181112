package com.musala.javacourse181112.SecondPart.Patterns.DecorationPattern;

public class MargaritaPizza implements PizzaPlate {
    private String pizzaName;

    public MargaritaPizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    @Override
    public void createPizza(String component) {
        System.out.println("Add pizzaPlate"+ component +" in: "+ pizzaName);
    }
}

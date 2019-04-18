package com.musala.javacourse181112.SecondPart.Patterns.DecorationPattern;

public class PizzaDecorator implements PizzaPlate {
    PizzaPlate pizzaPlate;

    public PizzaDecorator(PizzaPlate PizzaPlate) {
        this.pizzaPlate = PizzaPlate;
    }

    @Override
    public void createPizza(String componentName) {
        pizzaPlate.createPizza(componentName);
    }
}

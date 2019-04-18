package com.musala.javacourse181112.SecondPart.Patterns.DecorationPattern;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaPlate pizzaPlate = new MargaritaPizza("MargaritaPizza");
        PizzaPlate pizzaWithSauce = new SauceDecorator(pizzaPlate,"chiliSauce");

        pizzaWithSauce.createPizza("peperoni");
    }
}

package com.musala.javacourse181112.SecondPart.Patterns.DecorationPattern;

public class SauceDecorator extends PizzaDecorator {
    private String sauceName;

    public SauceDecorator(PizzaPlate pizzaPlate, String sauceName) {
        super(pizzaPlate);
        this.sauceName = sauceName;
    }

    @Override
    public void createPizza(String componentName) {
        super.createPizza(componentName);
        addComponent(componentName,this.pizzaPlate);
    }

    private void addComponent(String component, PizzaPlate pizzaPlate){
        System.out.println("add component " + component + "on" + sauceName);
    }
}

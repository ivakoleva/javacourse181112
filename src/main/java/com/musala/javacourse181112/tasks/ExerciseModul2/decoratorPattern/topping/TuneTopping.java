package com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping;

import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.pizza.BasePizza;

public class TuneTopping extends ToppingDecorator{

    public TuneTopping(BasePizza pizzaBase){
	super(pizzaBase);
	this.price = 1.0;
    }
}

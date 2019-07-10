package com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping;

import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.pizza.BasePizza;

public class KetchupTopping extends ToppingDecorator{

    public KetchupTopping(BasePizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.price = 1.89;
    }
}

package com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping;

import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.pizza.BasePizza;

public class MustardTopping extends ToppingDecorator{

    public MustardTopping(BasePizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.price = 0.50;
    }

}


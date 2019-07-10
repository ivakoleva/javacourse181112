package com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping;

import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.pizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza {

    protected BasePizza basePizza;
    
    public ToppingDecorator(BasePizza pizzaToDecorate)
    {
        this.basePizza = pizzaToDecorate;
    }

    @Override
    public double getPrice(){

        return (this.basePizza.getPrice() + this.price);
    }
}

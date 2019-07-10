package com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.main;

import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.pizza.Barbecue;
import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.pizza.Margarita;
import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping.ExtraCheeseTopping;
import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping.KetchupTopping;
import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping.MustardTopping;
import com.musala.javacourse181112.tasks.ExerciseModul2.decoratorPattern.topping.TuneTopping;


public class Example {

	public static void main(String[] args) {


		Barbecue bbqPizza = new Barbecue();
		System.out.println("Barbecue has price: " + bbqPizza.getPrice());


		ExtraCheeseTopping extraCheese = new ExtraCheeseTopping(bbqPizza);
		System.out.println("Barbecue with more cheese: " + extraCheese.getPrice());


		TuneTopping tt = new TuneTopping(extraCheese);
		System.out.println("Barbacue with more cheese and tune: " + tt.getPrice());


		KetchupTopping ketchup = new KetchupTopping(extraCheese);
		System.out.println("Barbecue with tune,extra cheese and ketchup: " + ketchup.getPrice());


		MustardTopping mustard = new MustardTopping(ketchup);

		System.out.println("Barbecue with tune,extra cheese,ketchup and mustard: " + mustard.getPrice());


		Margarita pizzaMargarita = new Margarita();
		System.out.println("Margarita has price: " + pizzaMargarita.getPrice());

		ExtraCheeseTopping cheeseTopping = new ExtraCheeseTopping(pizzaMargarita);
		System.out.println("Margarita with extra cheese: " + cheeseTopping.getPrice());


	}
}

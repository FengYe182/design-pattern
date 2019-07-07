package com.fengye.demo;

/**
 * @ClassName MealBuilder
 * @Description
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addFood(new VegBurger());
        meal.addFood(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addFood(new ChickenBurger());
        meal.addFood(new Pepsi());
        return meal;
    }


}

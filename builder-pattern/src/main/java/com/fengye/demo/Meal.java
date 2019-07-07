package com.fengye.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Meal
 * @Description
 */
public class Meal {

    private List<Food> foods = new ArrayList<Food>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Food food : foods) {
            cost += food.price();
        }
        return cost;
    }

    public void showFoods() {
        for (Food food : foods) {
            System.out.print("food : " + food.name());
            System.out.print(", Packing : " + food.packing().pack());
            System.out.println(", Price : " + food.price());
        }
    }
}

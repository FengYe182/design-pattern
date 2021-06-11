package com.fengye.demo2;

import com.fengye.demo1.Food;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 4:53 下午
 */
public class AmericanFoodFactory implements FoodFactory {
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        } else if (name.equals("B")) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}

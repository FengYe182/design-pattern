package com.fengye.demo2;

import com.fengye.demo1.Food;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 4:51 下午
 */
public class ChineseFoodFactory implements FoodFactory {
    public Food makeFood(String name) {
        if (name.equals("A")) {
            System.out.println("ChineseFoodA对象");
            return new ChineseFoodA();

        } else if (name.equals("B")) {
            System.out.println("ChineseFoodB对象");
            return new ChineseFoodB();
        } else {
            return null;
        }
    }
}

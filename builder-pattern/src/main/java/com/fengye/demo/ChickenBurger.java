package com.fengye.demo;

/**
 * @ClassName ChickenBurger
 * @Description
 */
public class ChickenBurger extends Burger {

    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }

}

package com.fengye.demo;

/**
 * @ClassName VegBurger
 * @Description
 */
public class VegBurger extends Burger {
    public float price() {
        return 25.5f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

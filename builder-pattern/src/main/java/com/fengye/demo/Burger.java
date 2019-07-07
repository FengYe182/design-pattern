package com.fengye.demo;

/**
 * @ClassName Burger
 * @Description
 */
public abstract class Burger implements Food {

    public String name() {
        return null;
    }

    public Packing packing() {
        return new Carton();
    }

    public abstract float price();
}

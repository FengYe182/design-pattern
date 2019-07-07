package com.fengye.demo;

/**
 * @ClassName Drink
 * @Description
 */
public abstract  class Drink implements Food {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}

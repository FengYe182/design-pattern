package com.fengye.demo;

/**
 * @ClassName Stock
 * @Description
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    void buy() {
        System.out.println("Stock [ Name: " + name +
                ",Quantity: " + quantity + " ] bought");
    }

    void sell() {
        System.out.println("Stock [ Name: " + name +
                ",Quantity: " + quantity + " ] sold");
    }
}

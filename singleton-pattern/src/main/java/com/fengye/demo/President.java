package com.fengye.demo;

/**
 * @ClassName President
 * @Description
 */
public class President {

    private final static President PRESIDENT = new President();

    private President() {
    }

    public static President getInstance() {
        System.out.println("创建一个总统!");
        return PRESIDENT;
    }

    public void getName() {
        System.out.println("美国总统：特朗普");
    }
}

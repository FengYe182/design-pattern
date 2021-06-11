package com.fengye.demo2;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 3:00 下午
 */
public class Test {

    public static void main(String[] args) {
        Beverage beverage = new RedTea();

        beverage = new Lemon(new Lemon(beverage));

        beverage = new Mango(beverage);

        System.out.println(beverage.desc() + " 价格：￥" + beverage.cost());
    }
}

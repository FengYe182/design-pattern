package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 8:24 下午
 */
public class Test {

    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
    }

}


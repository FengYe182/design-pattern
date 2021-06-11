package com.fengye.demo2;

import com.fengye.demo1.Food;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 4:54 下午
 */
public class Test {
    public static void main(String[] args) {
        // 先选择一个具体的工厂
        FoodFactory factory = new ChineseFoodFactory();
        // 由第一步的工厂产生具体的对象，不同的工厂造出不一样的对象
        Food food = factory.makeFood("A");
    }
}

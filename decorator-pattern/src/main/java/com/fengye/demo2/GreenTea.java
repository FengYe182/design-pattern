package com.fengye.demo2;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:53 下午
 */

public class GreenTea extends Beverage {

    @Override
    String desc() {
        return "绿茶";
    }

    @Override
    Double cost() {
        return Double.valueOf(12);
    }
}

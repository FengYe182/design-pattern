package com.fengye.demo2;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:58 下午
 */
public class Mango extends Condiment {
    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String desc() {
        return beverage.desc() + ",加芒果";
    }

    @Override
    Double cost() {
        return beverage.cost() + 1;
    }
}

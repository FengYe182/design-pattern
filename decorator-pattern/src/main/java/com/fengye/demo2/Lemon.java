package com.fengye.demo2;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:56 下午
 */
public class Lemon extends Condiment {

    private Beverage bevarage;

    public Lemon(Beverage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    String desc() {
        return bevarage.desc() + ",加柠檬";
    }

    @Override
    Double cost() {
        return bevarage.cost() + 2;
    }
}

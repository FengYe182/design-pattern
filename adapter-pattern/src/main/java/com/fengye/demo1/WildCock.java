package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 12:00 下午
 */
public class WildCock implements Cock {
    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡飞");
    }
}

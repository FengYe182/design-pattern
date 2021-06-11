package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption 简单工厂
 * @date 2021/6/10 4:30 下午
 */
public class FoodFactory {

    private static Food makeFood(String name) {
        if (name.equals("noodle")) {
            Food noodle = new LanZhouNoodle();
            noodle.addSpicy("more");
            return noodle;
        } else if (name.equals("chicken")) {
            Food chicken = new HuangMenChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }

    }

}


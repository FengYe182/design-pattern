package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 8:10 下午
 */
public class FoodServiceImpl implements FoodService {

    @Override
    public Food makeChicken() {

        Food f = new Chicken();
        ((Chicken) f).setChicken("1kg");
        ((Chicken) f).setSpicy("1g");
        f.setSalt("3g");
        return f;

    }

    @Override
    public Food makeNoodle() {
        Food f = new Noodle();
        ((Noodle) f).setNoodle("500g");
        f.setSalt("5g");
        return f;
    }
}

package com.fengye.demo2;

import com.fengye.demo1.Food;
import com.fengye.demo1.HuangMenChicken;
import com.fengye.demo1.LanZhouNoodle;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/10 4:30 下午
 */
public interface FoodFactory {

    Food makeFood(String name);
}


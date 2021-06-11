package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:08 下午
 */
public class RedDraw implements DrawApi {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}

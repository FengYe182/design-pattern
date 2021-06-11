package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:16 下午
 */
public class Rectangle extends Shape {

    private int x;
    private int y;

    protected Rectangle(DrawApi drawApi, int x, int y) {
        super(drawApi);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.draw(0, x, y);
    }
}

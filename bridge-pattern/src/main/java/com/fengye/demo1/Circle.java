package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:13 下午
 */
public class Circle extends Shape {

    private int radius;

    protected Circle(DrawApi drawApi, int radius) {
        super(drawApi);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.draw(radius, 0, 0);
    }
}

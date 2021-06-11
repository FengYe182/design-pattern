package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:10 下午
 */
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}

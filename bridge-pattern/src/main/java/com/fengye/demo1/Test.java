package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 2:18 下午
 */
public class Test {

    public static void main(String[] args) {

        Shape greenCircle = new Circle(new GreenDraw(), 10);

        Shape redRectangle = new Rectangle(new RedDraw(), 5, 10);

        greenCircle.draw();
        redRectangle.draw();
    }
}

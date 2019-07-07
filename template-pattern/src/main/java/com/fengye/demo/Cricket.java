package com.fengye.demo;

/**
 * @ClassName Cricket
 * @Description
 */
public class Cricket extends Game {
    @Override
    void init() {
        System.out.println("Cricket初始化");
    }

    @Override
    void start() {
        System.out.println("Cricket开始");
    }

    @Override
    void end() {
        System.out.println("Cricket结束");
    }
}

package com.fengye.demo;

/**
 * @ClassName Football
 * @Description
 */
public class Football extends Game {
    @Override
    void init() {
        System.out.println("Football初始化");
    }

    @Override
    void start() {
        System.out.println("Football开始");
    }

    @Override
    void end() {
        System.out.println("Football结束");
    }
}

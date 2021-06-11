package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption 饿汉式
 * @date 2021/6/10 6:26 下午
 */
public class Singleton {

    private Singleton() {
    }
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

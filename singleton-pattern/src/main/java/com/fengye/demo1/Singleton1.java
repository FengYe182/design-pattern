package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption 饱汉式 双重检测
 * @date 2021/6/10 6:26 下午
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 instance = null;

    public static Singleton1 getInstance() {
        if (instance == null) {   //第一次检查
            synchronized (Singleton1.class) {
                if (instance == null) {    //第二次检查
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}

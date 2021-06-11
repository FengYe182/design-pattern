package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption 内部类/嵌套类
 * @date 2021/6/10 6:32 下午
 */
public class InSingleton {

    private InSingleton() {
    }

    private static class InClass {
        private static InSingleton singleton = new InSingleton();
    }

    public static InSingleton getInstance() {
        return InClass.singleton;
    }
}

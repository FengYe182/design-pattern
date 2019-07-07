package com.fengye.demo;

public class InnerClassSingletonTest {

    private InnerClassSingletonTest() {
    }

    //静态内部类虽然保证了单例在多线程并发下的线程安全性，但是在遇到序列化对象时，
    // 默认的方式运行得到的结果就是多例的。这种情况不多做说明了，使用时请注意。
    private static class InnerClassSingleton {
        private static InnerClassSingletonTest innerClassSingleton = new InnerClassSingletonTest();
    }

    public static InnerClassSingletonTest getInstance() {
        return InnerClassSingleton.innerClassSingleton;
    }
}

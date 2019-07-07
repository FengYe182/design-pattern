package com.fengye.demo;

public class lazySingletonTest {

    private static volatile lazySingletonTest lazySingletonTest;

    private lazySingletonTest() {
    }

    public static lazySingletonTest singletonTest() {

        if (lazySingletonTest == null) {
            synchronized (lazySingletonTest.class) {
                if (lazySingletonTest == null) {
                    lazySingletonTest = new lazySingletonTest();
                }
            }
        }
        return lazySingletonTest;
    }
}

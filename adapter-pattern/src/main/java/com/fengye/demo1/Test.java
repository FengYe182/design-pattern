package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 12:02 下午
 */
public class Test {

    public static void main(String[] args) {

        Cock wildCock = new WildCock();
        Duck duck = new CockAdapter(wildCock);

        duck.fly();
        duck.quack();
//        System.out.println();
//        System.out.println(duck.quack());
    }
}

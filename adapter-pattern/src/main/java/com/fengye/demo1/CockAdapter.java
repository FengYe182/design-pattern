package com.fengye.demo1;

/**
 * @author WRF
 * @Descirption
 * @date 2021/6/11 12:01 下午
 */
public class CockAdapter implements Duck {

    private Cock cock;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    @Override
    public void quack() {

        cock.gobble();
//        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        cock.fly();
//        System.out.println("飞");

    }

    @Override
    public String toString() {
        return "CockAdapter{" +
                "cock=" + cock +
                '}';
    }
}

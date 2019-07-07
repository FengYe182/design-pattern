package com.fengye.demo;

/**
 * @ClassName StartState
 * @Description
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("停止！");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}

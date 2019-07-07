package com.fengye.demo;

/**
 * @ClassName StrategyPatternDemo
 * @Description
 */
public class StrategyPatternDemo {

    //注意与状态模式的对比 ???? 

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new SubstractOperation());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

//        Context context1 = new Context();
    }

}

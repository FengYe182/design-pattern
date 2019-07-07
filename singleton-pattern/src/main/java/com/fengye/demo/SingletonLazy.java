package com.fengye.demo;

/**
 * @ClassName SingletonLazy
 * @Description
 */
public class SingletonLazy {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 President() 是不可见的
//        President object = new President();

        President zt1= President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2=President.getInstance();
        zt2.getName();    //输出总统的名字
        if(zt1==zt2)
        {
            System.out.println("他们是同一人！");
        }
        else
        {
            System.out.println("他们不是同一人！");
        }
    }
}

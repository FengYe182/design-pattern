package com.fengye.demo;

/**
 * @ClassName citation
 * @Description
 */
public class citation implements Cloneable {
    String name;
    String info;
    String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    void display() {
        System.out.println(name + info + college);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return super.clone();
    }
}

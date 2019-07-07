package com.fengye.demo;

/**
 * @ClassName ComputerPartDisplayVisitor
 * @Description
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("使用电脑");

    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("使用鼠标");

    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("使用键盘");

    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("使用显示器");

    }
}

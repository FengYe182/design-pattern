package com.fengye.demo;

/**
 * @ClassName Keyboard
 * @Description
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

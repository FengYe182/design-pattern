package com.fengye.demo;

/**
 * @ClassName Mouse
 * @Description
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

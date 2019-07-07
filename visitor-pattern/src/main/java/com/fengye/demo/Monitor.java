package com.fengye.demo;

/**
 * @ClassName Monitor
 * @Description
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
